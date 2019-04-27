package FileOrBuffer;

import java.io.*;
public class Test {
	public static void main(String[] args) throws IOException{
		long time = System.currentTimeMillis();//当前时间
		System.out.println(time);
		FileWriter filewriter=new FileWriter("filewriter.txt");
		int number;
		for(int i=1;i<=10000;i++){
			number=(int)(Math.random()*100);
			filewriter.write(number+"  ");
			}
		filewriter.close();
		time=System.currentTimeMillis()-time;//时间差
		System.out.println("Filewriter用时为："+time+"微秒.");
	
		
		long time1 = System.currentTimeMillis();//当前时间
		BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("Bufferedwriter.txt"));
		int number1;
		for(int i=1;i<=10000;i++){
			number1=(int)(Math.random()*100);
			bufferedWriter.write(number1+"  ");
			}
		bufferedWriter.close();
		time=System.currentTimeMillis()-time1;//时间差
		System.out.println("bufferedwriter用时为："+time+"微秒.");
	}
	
}
