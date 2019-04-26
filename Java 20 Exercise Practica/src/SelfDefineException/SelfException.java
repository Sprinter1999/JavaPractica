package SelfDefineException;

import java.util.Scanner;

class SelfExp extends Exception{};//声明一个异常类

public class SelfException {
	public static void main(String[] args) 
	{
		System.out.println("Input my real name");
		String accurateString="xuefen";
		Scanner inScanner=new Scanner(System.in);
		String test=inScanner.next();
		inScanner.close();
		try 
		{
			test(test,accurateString);
		}
		catch (SelfExp e) {
			// TODO: handle exception
			System.out.print("Wrong");
		}
	}

	public static void test(String A, String B)throws SelfExp {
		// TODO Auto-generated method stub
		if(A.equals(B)==false)
			throw new SelfExp();
	}

}	
