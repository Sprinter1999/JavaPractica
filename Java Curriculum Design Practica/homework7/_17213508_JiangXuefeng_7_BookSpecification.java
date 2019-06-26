package homework7;

public class _17213508_JiangXuefeng_7_BookSpecification 
{
    static public final int NoExist=-1;//构造函数默认，代表不存在
    static public final int NoComputerBook=0;//非计算机类教材图书
    static public final int TextBook=1;//教材类
    static public final int ComicBook=2;//连环画
    static public final int DietBook=3;//养身图书
    static public final int Other=4;//其他
    static public final String[] toStr={"非教材类计算机图书","教材类图书","教材类图书","养生类图书","其他"};
    private String Title=null;
    private String Isbn=null;
    private double Price=0;
    private int Type= NoExist;
    
    
    public _17213508_JiangXuefeng_7_BookSpecification() 
    {
    	
    }
    public _17213508_JiangXuefeng_7_BookSpecification(String i,double p,String t,int e)
    {
        this.Title=t;
        this.Isbn=i;
        this.Price=p;
        this.Type=e;
    }
    public String getIsbn()
    {
        return Isbn;
    }
    public java.lang.String getTitle() {
        return Title;
    }
    public double getPrice() {
        return Price;
    }
    public int getType() {
        return Type;
    }
}
