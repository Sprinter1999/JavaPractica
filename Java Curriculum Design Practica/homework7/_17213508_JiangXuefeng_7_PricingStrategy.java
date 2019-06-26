package homework7;

import java.util.HashSet;
import java.util.Set;

abstract public class _17213508_JiangXuefeng_7_PricingStrategy implements _17213508_JiangXuefeng_7_IPricingStrategy
{
    private String ID="";
    private String name="";

    private HashSet<Integer> book=new HashSet<Integer>();

    public _17213508_JiangXuefeng_7_PricingStrategy()
    {
    	
    }

    public _17213508_JiangXuefeng_7_PricingStrategy(HashSet<Integer> book,String i,String n)
    {
        this.book.addAll(book);
        this.ID=i;
        this.name=n;
    }

    public void setBook(Set<Integer> list)
    {
        book.addAll(list);
    }

    public boolean containBook(int t)
    {
        return book.contains(t);
    }

    public String getID()
    {
        return ID;
    }

    public String getName()
    {
        return name;
    }

    public String getBookTypes()
    {
        StringBuilder temp=new StringBuilder();

        if(book.size()>0)
            for(int t:book)
                temp.append(_17213508_JiangXuefeng_7_BookSpecification.toStr[t]+"");
        else
            temp.append("无");

        return temp.toString();
    }

    abstract public double getSubTotal(_17213508_JiangXuefeng_7_SaleLineItem i);

    abstract public String getType();

    abstract public String getPara();
}

