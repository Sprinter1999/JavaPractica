package skr2;
//提交oj的时候别带package
import java.util.Scanner;
import java.math.*;
public class daffodil {

    public static void main(String[] args) {
    	Scanner inScanner=new Scanner(System.in);
    	int num=inScanner.nextInt();
    	if(num<=100||num>=10000)
    		System.out.print("");
    	else {
    		for(int i=100;i<=num;i++)
    		{
    			if(Shuixian(i)==true)
    				System.out.println(i);
    			else 
					continue;
    		}
		}
    }
    public static boolean Shuixian(int backnumber) {
    	if(backnumber<1000)//san wei shu
    	{
    		int gewei=backnumber%10;
    		int shiwei=(backnumber/10)%10;
    		int baiwei=(backnumber/100)%10;
    		int sum=0;
    		sum=(int)(Math.pow(gewei, 3)+Math.pow(baiwei, 3)+Math.pow(shiwei, 3));
    		boolean result=(sum==backnumber);
    		return result;
    	}
    	
    	else//四位数,其实水仙花数只有三位，所以这一段相当于没用
    	{
    		int gewei=backnumber%10;
    		int shiwei=(backnumber/10)%10;
    		int baiwei=(backnumber/100)%100;
    		int qianwei=(backnumber/1000)%1000;
    		int sum=0;
    		sum=(int)(Math.pow(gewei, 3)+Math.pow(baiwei, 3)+Math.pow(shiwei, 3)+Math.pow(qianwei, 3));
    		boolean result=(sum==backnumber);
    		return result;
    	}
		
	}
}

    