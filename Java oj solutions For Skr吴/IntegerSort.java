package skr1;
//@��������OJ
import java.util.Scanner;

public class IntegerSort {
public static void main(String[] args) {
	Scanner inScanner=new Scanner(System.in);
	int num=inScanner.nextInt();
	int[] numArr=new int[num];
	for (int i = 0; i < numArr.length; i++) {
		numArr[i] = inScanner.nextInt();
		/*
		 * 1.���ǿ��Կ�����ArrayListʵ��һ��
		 * 2.Ҫ���Next()��NextLine()������
		 * */
	}
	inScanner.close();
	selectSort(numArr);
	for(int j=0;j<num;j++)
		System.out.print(numArr[j]+" ");//�����ʽ����oj��һ��
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
