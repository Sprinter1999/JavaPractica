package test;

import javax.swing.JFrame;
import java.math.BigDecimal;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.util.Scanner;

/*
 * @由于在算排列组合的时候整形数会受限制，所以最多支持到n=17，p无所谓
 * */
public class test {

	public static void main(String[] args) {
	
	Scanner inScanner=new Scanner(System.in);
	System.out.println("请输入重复数目");
	int eventNum=inScanner.nextInt();
	System.out.println("请输入单次事件发生概率");
	double eventPro=inScanner.nextDouble();
	if (eventPro>=1||eventPro<=0)
			{
				System.out.println("不合法输入，停止程序");
				System.exit(0);
			}
	XYSeries series = new XYSeries("xySeries");
	//let x,y be "Times" and Probability of each "Time"
	BigDecimal sum=new BigDecimal(0);
    for (int x = 0; x < eventNum; x++) 
    {	
    	BigDecimal proba1=new BigDecimal(Math.pow(eventPro, x));
    	BigDecimal y=new BigDecimal(Combination(eventNum, x));
    	BigDecimal proba2=new BigDecimal(Math.pow(1-eventPro, eventNum-x));
    	y=y.multiply(proba1);
    	y=y.multiply(proba2);
    	System.out.println(y);
		series.add(x, y);
		sum=sum.add(y);
    }
    System.out.println(sum);
	XYSeriesCollection dataset = new XYSeriesCollection();
	dataset.addSeries(series);
	JFreeChart chart = ChartFactory.createXYLineChart(
			"Binomial distribution ", // chart title
			"times", // x axis label
			"Probability", // y axis label
			dataset, // data
			PlotOrientation.VERTICAL,
			false, // include legend
			false, // tooltips
			false // urls
			);

	ChartFrame frame = new ChartFrame("二项分布", chart);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

 public static int Combination(int n, int k) 
{
	/*Recursive process:效率其实都比较低
	 * if(k==0||k==n)
		return 1;
	else
		return Combination(n-1, k)+Combination(n-1, k-1);*/
	int a=1,b=1;
	if(k>n/2) {
		k=n-k;
	}
	for(int i=1;i<=k;i++) {
		a*=(n+1-i);
		b*=i;
	}
	return a/b;
}
}



