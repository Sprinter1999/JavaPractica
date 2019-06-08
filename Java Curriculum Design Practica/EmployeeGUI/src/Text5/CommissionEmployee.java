package Text5;


public class CommissionEmployee extends Employee
{
    private double commissionRate;
    private double grossSales;
    
    
    
    //无参构造函数
    public CommissionEmployee()
    {
    	super();
        commissionRate=0.0;
        grossSales=0.0;
    }
    //全参数构造函数
    public CommissionEmployee(double c,double g,String f,String l,String s)
    {
        super(f,l,s);
        commissionRate=c;
        grossSales=g;
    }
    
    //getter and setter
    public final double getcommissionRate()
    {
        return commissionRate;
    }

    public final double getGrossSales()
    {
        return grossSales;
    }

    public final void setCommissionRate(double c)
    {
        commissionRate=c;
    }

    public final void setGrossSales(double g)
    {
        grossSales=g;
    }

    @Override

    public int earning() 
    {
        return (int)Math.floor(grossSales*commissionRate);//向下取整再int
    }

}