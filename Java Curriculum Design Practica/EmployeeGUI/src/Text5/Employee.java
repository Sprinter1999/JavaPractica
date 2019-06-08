package Text5;

public abstract class Employee
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
    public abstract int earning();
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
        infoString+="社保号: "+getSocialSecurityNumber()+" firstname: "+getfirstname()+" lastname: "+getLastname()+", \n";
        infoString+="This Month Salary: ";
        infoString+=earning()+"\n";
        return infoString;
    }
}
