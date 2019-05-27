package GroupObjects;

public class HourlyEmployee extends Employee
{
    private double wage;//工作时薪
    private double hours;//工作小时个数
    //无参数构造函数
    public HourlyEmployee()
    {
        wage=0.0;
        hours=0.0;
    }
    //全参数构造函数
    public HourlyEmployee(double w,double h,String f,String l,String s)
    {
    	//先调用父类构造函数进行初始化
        super(f,l,s);
        wage=w;
        hours=h;
    }
    //简单的Getter与Setter
    public final double getWage()
    {
        return wage;
    }

    public final double getHours()
    {
        return hours;
    }

    public final void setWage(double w)
    {
        wage=w;
    }

    public final void setHours(double h)
    {
        hours=h;
    }

    @Override
    public int earning() 
    {
        return (int)Math.floor(wage*hours);//向下取整再int
    }


}
