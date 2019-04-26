package OverloadAndExtend;
/*
 * @As the name suggests,Overload is just a kinda repeat
 *@Based on <郑莉版教材解析>
 */
class A {
	public void showTime () {
		System.out.println ("空重载");
	}
	
	public void showTime (int l) {
		System.out.println ("整形参数重载");
	}
	
	public void showTime (char l) {
		System.out.println ("字符参数重载");
	}
}
//B类
class B extends A {
	public void showTime (String l) {
		System.out.println ("字符串参数重载");
	}
}
//测试类
public class Test3 {
	public static void main (String args[]) {
		B b = new B();
		
		b.showTime();
		b.showTime(5);
		b.showTime('f');
		b.showTime("Boy next door");
	}
}