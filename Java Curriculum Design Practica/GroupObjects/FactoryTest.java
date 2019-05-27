package GroupObjects;

import java.util.Scanner;

public class FactoryTest {
	private Factory myFactory;
	
	Scanner inScanner=new Scanner(System.in);
	public FactoryTest()
	{
		myFactory=new Factory();
	}
	public void searchFind()
	{
//		Scanner tempScanner=new Scanner(System.in);
		String idString=inScanner.next();
		if(myFactory.getEmployee(idString)!=null)
			System.out.println(myFactory.getEmployee(idString));
		else {
			System.out.println("The SocialSecureID you look for is non-existential");
		}
	}
	public void UpdateAEmp()
	{
		System.out.print("Now try to update info\n");
//		Scanner inScanner=new Scanner(System.in);
		String idString = inScanner.next();
		if(myFactory.getEmployee(idString)==null)
        {
            System.out.println("SocialSecureID is non-existential, an invalid Number");
            return;
        }
		System.out.print("Now update this employee's info:");
        int choice;
        System.out.println("0->salaried 1->hourly 2->commission 3->base plus commission else->return back");
        choice=inScanner.nextInt();
        
        if(choice<0||choice>3)
        {
            System.out.println("invalid Choice!");
            return ;
        }
        Employee TempEmp= myFactory.genEmp(choice);
        
        myFactory.updateEmployee(idString,TempEmp);
        System.out.println("updated Successfully");
			
	}
	public void DeleteAEmp()
	{
		System.out.println("Please input the Social number you want to delete!");

        String TempNumber=inScanner.next();

        Employee TempEmployee=myFactory.deleteEmployee(TempNumber);

        if(TempEmployee==null)
            System.out.println("Error,without this employee!");
        else
            System.out.println("Success!");
		
	}
	public void printAllInfo()
	{
		myFactory.printEmployees();
	}
	public void Manage()
	{
		
		System.out.print("Welcome to my factory,please input some employees' info.\n");
		myFactory.initEmployees();
		
		
//		Scanner inScanner=new Scanner(System.in);
		boolean endFlag=false;
		
		while(true)
		{
			System.out.print("OK...Now you have some operations.\n"
					+ "1->SearchIDAndFind 2->UpdateAEmployee 3->DeleteAEmployee 4->printAllInfo"
					+ " 5 or others ->quit\n");
			int operation;
			operation=inScanner.nextInt();
			
			switch(operation)
			{
			case 1:
				this.searchFind();
				break;
			case 2:
				this.UpdateAEmp();
				break;
			case 3:
				this.DeleteAEmp();
				break;
				
			case 4:
				this.printAllInfo();
				break;
			default:
				endFlag=true;
				break;
			}
			if(endFlag==true)
				break;
		}

		System.out.print("程序运行结束.\n");
		
	}
	
	public static void main(String[] args) 
	{
		FactoryTest test=new FactoryTest();
		test.Manage();
	}
}
