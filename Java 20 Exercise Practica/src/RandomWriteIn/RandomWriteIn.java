package RandomWriteIn;

import java.util.Random;
import java.util.Scanner;
import java.io.*;



//TODO:
//创建一存储若干随机整数的文本文件，文件名、整数的个数及范围均由键盘输入。
public class RandomWriteIn
{
	public static void main(String[] args)throws Exception
	{
		//BufferedReader 
			String fileName;
			int count,min,max;
			Scanner in = new Scanner(System.in);
			System.out.println("输入要存储的文件名");
			fileName=in.next();
			System.out.println("输入随机数个数");
			count=in.nextInt();
			System.out.println("输入随机数最小值");
			min=in.nextInt();
			System.out.println("输入随机数最大值");
			max=in.nextInt();
			in.close();
			Memory M=new Memory(fileName,count,max,min);
			M.init();
	}
}
class Memory
{
	private String nameString;
	private int count;
	private int max;
	private int min;
	//AUTO produced using constructor
	public Memory(String nameString, int count, int max, int min) {
		//super();
		this.nameString = nameString;
		this.count = count;
		this.max = max;
		this.min = min;
	}
	public void init(){
		try{		
		FileWriter out=new FileWriter(nameString);
		int limit=max-min;
		Random random = new Random();
		for (int i=1;i<=count;i++){
			int number=min+random.nextInt(limit);	
			//TODO:学习了给定范围内随机数的生成方式
			System.out.print(number+" ");
			out.write(number+"  ");
			}	
		out.close();
		}catch(IOException iox){
		     System.out.println("方法startmemory()有问题");
		}
		
	} 
	
}