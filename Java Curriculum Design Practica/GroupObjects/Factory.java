package GroupObjects;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;


public class Factory 
{	
	//Empty HashMap,<key,val>=<SecurityNum,Employee>
	private HashMap<String,Employee> Employees;
	//Which is used for randomly generating objs
	static private final int Salarid=0;
    static private final int Hourly=1;
    static private final int Commision=2;
    static private final int BasePlusCommision=3;
    
    public Factory() 
    {
    	Employees=new HashMap<String,Employee>();
	}
    
    public Employee genEmp(int choice)
    {
    	
        String f,l,s;
        Scanner cin =new Scanner(System.in);
        System.out.println("请依次输入firstname，lastname，socialSecurityNumber，中间用逗号分割");
        String t=cin.nextLine();
        String[] a=t.split(",");
        
        
        if(a.length!=3)
        {
        	System.out.print("wrong");
        	return null;
        }
        else
        {
            f=a[0];
            l=a[1];
            s=a[2];
        }
        if(s.equals("0000"))
            return null;
        System.out.println(choice);
            
        switch (choice)
        {
            case Salarid:
            {
                System.out.println("请输入周薪：");
                double temp=cin.nextDouble();
                    
//                cin.close();
                return new SalaridEmployee(temp,f,l,s);
                }
            case Hourly:
                {
                	System.out.println("请输入工作时间：");
                    double ho=cin.nextDouble();
                    System.out.println("请输入薪水：");
                    double wa=cin.nextDouble();
                    
                    //cin.close();
                    return new HourlyEmployee(wa,ho,f,l,s);
                }
            case Commision:
                {
                    System.out.println("请输入销售额：");
                    double gr=cin.nextDouble();
                    System.out.println("请输入佣金率：");
                    double co=cin.nextDouble();
                    
                    //cin.close();
                    return new CommissionEmployee(co,gr,f,l,s);
                }
            case BasePlusCommision:
                {
                    System.out.println("请输入销售额：");
                    double gr=cin.nextDouble();
                    System.out.println("请输入佣金率：");
                    double co=cin.nextDouble();
                    System.out.println("请输入基础工资");
                    double ba=cin.nextDouble();
                    
                    
                    return new BasePlusCommissionEmployee(ba,co,gr,f,l,s);
                }
            default:
                {
                    System.out.print("Wrong choice");
                }
            }
		return null;
            
        }
    
    
    public void initEmployees()
    {
    	Random random=new Random();
    	int EmpCounter=1;
    	for(;EmpCounter<=10;EmpCounter++)
    	{
    		int choice=random.nextInt(4);
    		switch (choice) {
			case Salarid:
				System.out.print("A Salarid Emp Generated!\n");
				break;
			case Hourly:
				System.out.print("An Hourly Emp Generated!\n");
				break;
			case Commision:
				System.out.print("A Commission Emp Generated!\n");
				break;
			case BasePlusCommision:
				System.out.print("A BasePlusCommission Emp Generated\n");
				break;			
			}
    		Employee tempEmployee=genEmp(choice);
    		System.out.print("您输入的信息如下:\n"+tempEmployee);
    		if(tempEmployee!=null)
                this.addEmployee(tempEmployee);
    		else
    			return;
//    		System.out.println("HASHMAP:"+this.Employees.size());
    	}
    	
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
            return Employees.put(empSecNum,emp);
        else
            return null;
    }
    public void printEmployees()
    {
    	System.out.print("All employees' info is:\n");
    	for(Employee emp:Employees.values())
    	{
    		System.out.println(emp);
    	}
    }
}
