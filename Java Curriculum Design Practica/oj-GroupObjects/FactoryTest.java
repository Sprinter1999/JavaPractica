package oj;


import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

class Factory 
{	
	public HashMap<String,Employee> Employees;
	static private final int Salarid=0;
    static private final int Hourly=1;
    static private final int Commision=2;
    static private final int BasePlusCommision=3;
    
    public Factory() 
    {
    	Employees=new HashMap<String,Employee>();
	}
    
    public Employee genEmployee(int choice,String[] cmd)
    {
    	
        String f,l,s;
        
        if(cmd.length==2)
        {
        	return null;
        }
        
        f=cmd[2];
        l=cmd[3];
        s=cmd[4];
        
            
        switch (choice)
        {
            case Salarid:
            {
//                System.out.println("请输入周薪：");
                double temp=Double.parseDouble(cmd[5]);
                return new SalaridEmployee(temp,f,l,s);
                }
            case Hourly:
                {
//                	System.out.println("请输入工作时间：");
                    double ho=Double.parseDouble(cmd[5]);
//                    System.out.println("请输入薪水：");
                    double wa=Double.parseDouble(cmd[6]);
                    
                    //cin.close();
                    return new HourlyEmployee(wa,ho,f,l,s);
                }
            case Commision:
                {
//                    System.out.println("请输入销售额：");
                    double gr=Double.parseDouble(cmd[5]);
//                    System.out.println("请输入佣金率：");
                    double co=Double.parseDouble(cmd[6]);
                    
                    //cin.close();
                    return new CommissionEmployee(co,gr,f,l,s);
                }
            case BasePlusCommision:
                {
//                    System.out.println("请输入销售额：");
                    double gr=Double.parseDouble(cmd[5]);
//                    System.out.println("请输入佣金率：");
                    double co=Double.parseDouble(cmd[6]);
//                    System.out.println("请输入基础工资");
                    double ba=Double.parseDouble(cmd[7]);
                    return new BasePlusCommissionEmployee(ba,co,gr,f,l,s);
                }
            default:
                {
                    return null;
                }
            }
            
        }
    
    
    public Employee initEmployees(String[] cmd)
    {
    		int choice=Integer.parseInt(cmd[1]);
    		Employee tempEmployee=genEmployee(choice,cmd);
//    		System.out.print("您输入的信息如下:\n"+tempEmployee);
    		if(tempEmployee!=null)
                return tempEmployee;
    		else
    			return null;
    }
    public Employee getEmployee(String empSecNum)
    {
    	return Employees.get(empSecNum);
    }
    public Employee deleteEmployee(String empSecNum)
    {
    	return Employees.remove(empSecNum);
    }
    public Employee addEmployee(Employee stu)
    {
    	if(Employees.get(stu.getSocialSecurityNumber())!=null)
        {
            return null;
        }
        else
            return Employees.put(stu.getSocialSecurityNumber(),stu);
    }
    public Employee updateEmployee(String empSecNum ,Employee emp)
    {
    	if(Employees.get(empSecNum)!=null)
    	{
//    		System.out.printf("my earing %f\n",emp.earning());
            Employees.put(empSecNum,emp);
            return emp;
    	}
        else
        	{
        	System.out.print("update:employee not found.\n");
            return null;
            }
    }
    public void printEmployees()
    {
    	for(Employee emp:Employees.values())
    	{
    		System.out.print(emp);
    	}
    }
}
public class FactoryTest{
	public static void main(String[] args) {
        Factory factory = new Factory();
        Scanner inScanner=new Scanner(System.in);
        while (inScanner.hasNext()) {
    		String input = inScanner.nextLine();
            String[] cmd=input.split(" ");
            switch (cmd[0]) {
                case "init":
                {
                    Employee employee = factory.initEmployees(cmd);
                    if (employee != null)
                        factory.Employees.put(employee.getSocialSecurityNumber(), employee);
                    break;
                }
                case "get":
                {
                	String empSecNum=cmd[1];
                    Employee employee = factory.getEmployee(empSecNum);
                    if (employee != null) {
                        System.out.print(employee);
                    }
                    else {
                        System.out.println("get: employee not found.");
                    }
                    break;
                }
                case "add":
                {
                	if(factory.Employees.get(cmd[4])==null)
                	{
                		factory.addEmployee(factory.initEmployees(cmd));
                		System.out.print(factory.Employees.get(cmd[4]));
                	}
                	else {
						System.out.println("add: employee exists.");
					}
                    break;
                }
                case "update":
                {
                    Employee employee = factory.initEmployees(cmd);
                    Employee res = factory.updateEmployee(employee.getSocialSecurityNumber(), employee);
                    if (res != null) {
                        System.out.print(res.toString());
                    }
                    else {
                        System.out.println("update: employee not found.");
                    }
                    break;
                }
                case "delete":
                {
                    String empSecNum = cmd[1];
                    Employee employee = factory.deleteEmployee(empSecNum);
                    if (employee != null) {
                        System.out.print(employee.toString());
                    }
                    else {
                        System.out.println("delete: employee not found.");
                    }
                    break;
                }
                case "print":
                    factory.printEmployees();
                    break;
            }
        }
    }

}
abstract class Employee
{
    private String firstname;
    private String lastname;
    private final String socialSecurityNumber;

    public Employee()//无参数构造
    {
        firstname="firstname null";
        lastname="lastname null";
        socialSecurityNumber="securityNum null";
    }

    public Employee(String f,String l,String s)//有参数构造
    {
        firstname=f;
        lastname=l;
        socialSecurityNumber=s;
    }
	//所有的子类必须重写此方法
    public abstract double earning();
    //子类没必要修改这最基础的getter和setter方法
    public final String getfirstname()
    {
        return firstname;
    }

    public final void setFirstname(String F)
    {
        firstname=F;
    }

    public final String getLastname()
    {
        return lastname;
    }

    public final void setLastname(String L)
    {
        lastname=L;
    }

    public final String getSocialSecurityNumber()
    {
        return socialSecurityNumber;
    }

    @Override
    //TODO:为了让不同的类有各自个性化的toString方法，
    //我们每个类都有各自的toString方法而不统一用Employee类的方法
    public final String toString()
    {
        String infoString=new String();
        infoString+="firstName:"+this.getfirstname()+"; lastName:"+this.getLastname();
        infoString+="; socialSecurityNumber:"+this.getSocialSecurityNumber()+"; earning:"+new DecimalFormat(".00").format(earning())+'\n';
        return infoString;
    }
}
class BasePlusCommissionEmployee extends CommissionEmployee
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

    public double earning() {
        return (super.earning()+baseSalary);//向下取整再int
    }

}
class CommissionEmployee extends Employee
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

    public double earning() 
    {
        return grossSales*commissionRate;//向下取整再int
    }

}
class HourlyEmployee extends Employee
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
    public double earning() 
    {
        return wage*hours;
    }


}
class SalaridEmployee extends Employee
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

    public double earning() {
        return 4.0*weeklySalary;//向下取整再int
    }
}