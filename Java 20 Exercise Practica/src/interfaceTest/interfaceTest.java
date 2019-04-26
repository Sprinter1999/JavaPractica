package interfaceTest;

//定义接口Shape2D
interface Shape2D{
	double Pi=3.14;
	double area();//这里不允许写private double area(),只允许写public或者不写（默认public），
					//说明接口里面的抽象方法只能是public的
}
//Circle类实现接口Shape2D
class Circle implements Shape2D{
	double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public double area()
	{
		return Pi*radius*radius;
	}
	public void setPi()
	{
		//Circle.Pi=3.00;取消注释后，eclipse会提示你“final field cannot be assigned”
		//说明Pi就是一个static final
	}
}

public class interfaceTest{
	public static void main(String args[]){
		Circle c=new Circle(10);
		System.out.println("Pi=3.14圆的面积："+c.area());
}

}