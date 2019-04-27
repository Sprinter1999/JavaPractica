package WebWriteIn;

import java.io.*;
public class WebTest{
	public static void main(String[] args) throws IOException{
		
		BufferedWriter webBufferedWriter =new BufferedWriter(new FileWriter("test.html"));
		webBufferedWriter.write("<table border=1 align=center width=200 height=250>");
		webBufferedWriter.newLine();
		webBufferedWriter.write("<tr><td align=center>Power of 2<td align=center>Value</tr>");
		for (int i=0;i<=9;i++){
		webBufferedWriter.write("<tr><td align=center>"+i+"<td align=center>"+Math.pow(i, 2)+"</tr>");
		}		
		webBufferedWriter.write("</table>");
		webBufferedWriter.newLine();		
		webBufferedWriter.close();
		
	}	

}
