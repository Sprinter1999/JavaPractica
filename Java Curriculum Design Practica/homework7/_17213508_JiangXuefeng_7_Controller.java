package homework7;

import java.util.HashSet;

public class _17213508_JiangXuefeng_7_Controller {
	private _17213508_JiangXuefeng_7_BookCatalog bookCatalog = new _17213508_JiangXuefeng_7_BookCatalog();
    private static _17213508_JiangXuefeng_7_Controller instance;
    private _17213508_JiangXuefeng_7_PricingStrategyFactory factory = _17213508_JiangXuefeng_7_PricingStrategyFactory.getInstance();
    private _17213508_JiangXuefeng_7_Sale sale = new _17213508_JiangXuefeng_7_Sale();
    /* Singleton pattern */
    private _17213508_JiangXuefeng_7_Controller()
    {
        try {
            // Initialize the data (as required)
            addBook("978-7-302-2", 18, "《UML与模式应用》", 1);
            addBook("978-7-312-3", 34, "《Java与模式》", 0);
            addBook("968-6-302-1", 58, "《Headfirst设计模式》", 0);
            addBook("958-1-302-2", 30, "《爱丽丝历险记》", 2);
            addBook("900-7-392-2", 20, "《煲汤大全》", 3);

            addStrategy(0, "1", new HashSet<Integer>(){{ add(1); }}, "Discount001", "绝对值优惠策略1");
            addStrategy(1, "7", new HashSet<Integer>(){{ add(2); }}, "Discount002", "百分比折扣策略1");
            addStrategy(1, "3", new HashSet<Integer>(){{ add(0); }}, "Discount003", "百分比折扣策略2");
            addStrategy(2, "Discount001|Discount003",
                    new HashSet<Integer>(){{ add(3); }}, "Discount004", "顾客最优策略1");
        }
        catch (Exception e)
        {
            // There won't be an Exception
        }
    }
    public static _17213508_JiangXuefeng_7_Controller getInstance()
    {
        if (instance == null)
            instance = new _17213508_JiangXuefeng_7_Controller();
        return instance;
    }

    /**
     *  The Book Management Wrapper
     */
    public void addBook(String isbn, double price, String title, int type)
            throws Exception
    {
        _17213508_JiangXuefeng_7_BookSpecification book = new _17213508_JiangXuefeng_7_BookSpecification(isbn, price, title, type);

        if (bookCatalog.get(book.getIsbn()) != null)
            throw new Exception("本书已经存在！");
        else bookCatalog.add(book);
    }

    public String[][] getAllBooksInfo() { return bookCatalog.getAllData(); }

    public String[][] getAllStrategiesInfo() { return factory.getAllStratetiesInfo(); }

    public _17213508_JiangXuefeng_7_PricingStrategy deleteStrategy(String ID) { return factory.removePricingStrategy(ID); }

    public _17213508_JiangXuefeng_7_PricingStrategy addStrategy(int type, String paras, HashSet<Integer> books, String ID, String name)
            throws Exception
    {
        return factory.createPricingStrategy(type, paras, books, ID, name);
    }

    public _17213508_JiangXuefeng_7_PricingStrategy updateStrategy(int type, String paras, HashSet<Integer> books, String ID, String name)
            throws Exception
    {
        factory.removePricingStrategy(ID);
        return factory.createPricingStrategy(type, paras, books, ID, name);
    }

    public _17213508_JiangXuefeng_7_SaleLineItem buyBook(String ISBN, int num)
            throws Exception
    {

        _17213508_JiangXuefeng_7_BookSpecification bookInfo = bookCatalog.get(ISBN);
        if (bookInfo == null) throw new Exception("ISBN号无效");
        return sale.add(new _17213508_JiangXuefeng_7_SaleLineItem(num, bookInfo, factory.getStrategyOfBook(bookInfo.getType())));
    }

    public _17213508_JiangXuefeng_7_Sale getSale() { return sale; }
}
