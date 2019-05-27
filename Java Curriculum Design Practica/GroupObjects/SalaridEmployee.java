package GroupObjects;

public class SalaridEmployee extends Employee
{
    private double weeklySalary;
    
    
    //无参构造函数
    public SalaridEmployee()
    {
    	super();
        weeklySalary=0.0;
    }
    //全参数构造函数
    public SalaridEmployee(double w,String f,String l,String s)
    {
        super(f,l,s);
        weeklySalary=w;
    }
    
    //简单的getter与setter
    public final double getWeeklySalary() 
    { 
    	return weeklySalary; 
    }

    public final void setWeeklySalary(double w)
    {
        weeklySalary=w;
    }

    @Override

    public int earning() {
        return (int)Math.floor(4.0*weeklySalary);//向下取整再int
    }


}