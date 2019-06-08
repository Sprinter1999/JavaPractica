package Text5;


public class BasePlusCommissionEmployee extends CommissionEmployee
{
    private double baseSalary;

    //无参构造函数
    public BasePlusCommissionEmployee()
    {
    	super();
        baseSalary=0.0;
    }
    //全参数构造函数 
    public BasePlusCommissionEmployee(double b,double c,double g,String f,String l,String s)
    {
        super(c,g,f,l,s);
        baseSalary=b;
    }
    //getter and setter
    public final double getBaseSalary()
    {
        return baseSalary;
    }

    public final void setBaseSalary(double c)
    {
        baseSalary=c;
    }

    @Override

    public int earning() {
        return super.earning()+(int)Math.floor(baseSalary);//向下取整再int
    }

}