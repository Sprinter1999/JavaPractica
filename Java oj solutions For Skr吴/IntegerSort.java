package skr1;
//@整数排序OJ
import java.util.Scanner;

public class IntegerSort {
public static void main(String[] args) {
	Scanner inScanner=new Scanner(System.in);
	int num=inScanner.nextInt();
	int[] numArr=new int[num];
	for (int i = 0; i < numArr.length; i++) {
		numArr[i] = inScanner.nextInt();
		/*
		 * 1.我们可以考虑用ArrayList实现一次
		 * 2.要理解Next()和NextLine()的区别
		 * */
	}
	inScanner.close();
	selectSort(numArr);
	for(int j=0;j<num;j++)
		System.out.print(numArr[j]+" ");//输出格式按照oj调一下
}
public static void selectSort(int[] arr) {
    for (int x = 0; x < arr.length - 1; x++) {
        for (int y = x + 1; y < arr.length; y++) {
            if (arr[x] > arr[y]) {
                int temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
        }
    }
}
}
