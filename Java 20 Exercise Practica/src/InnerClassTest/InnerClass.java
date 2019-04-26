package InnerClassTest;
/*
 * 声明一个具有内部类的类，
 * 此内部类只有一个非默认的构造方法；
 * 声明另外一个具有内部类的类，此内部类继承第一个内部类。
 */

//A类
class A
{ 
	class ClassOfA
	{ 
		public ClassOfA()
		{
			
		}
	} 
}
//B类
public class InnerClass
{ 
	class ClassOfB extends A.ClassOfA{ 
		public ClassOfB(A b){ 
			b.super(); 
			} 
		} 
}