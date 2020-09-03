package Xing;

import java.util.Scanner;

public class Xing2 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入一个数字");
		double x=input.nextDouble();
		double y=input.nextDouble();
		System.out.println("最大值："+(x>y?x:y)+"最小值："+(x<y?x:y));
		
	}
}
