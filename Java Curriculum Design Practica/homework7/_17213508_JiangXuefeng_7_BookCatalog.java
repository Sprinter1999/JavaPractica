package homework7;

import java.util.HashMap;

public class _17213508_JiangXuefeng_7_BookCatalog {
	HashMap<String,_17213508_JiangXuefeng_7_BookSpecification> books= new HashMap<>();

    _17213508_JiangXuefeng_7_PricingStrategyFactory factory=_17213508_JiangXuefeng_7_PricingStrategyFactory.getInstance();

    public _17213508_JiangXuefeng_7_BookCatalog(){}


    public _17213508_JiangXuefeng_7_BookSpecification add(_17213508_JiangXuefeng_7_BookSpecification book)
    {
        books.put(book.getIsbn(),book);
        return book;
    }

    public _17213508_JiangXuefeng_7_BookSpecification get(String Is)
    {
        return books.get(Is);
    }

    public String[][] getAllData()
    {
        int i=0;
        String[][] data=new String[books.size()][];

        for(_17213508_JiangXuefeng_7_BookSpecification book:books.values()){
            data[i]=new String[]{
                    book.getIsbn(),
                    book.getTitle(),
                    _17213508_JiangXuefeng_7_BookSpecification.toStr[book.getType()],
                    String.valueOf(book.getPrice()),
                    factory.getStrategyOfBook(book.getType()).getType()
            };
            i++;
        }

        return data;
    }
}
