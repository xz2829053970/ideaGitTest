package Xing;

import java.util.Scanner;

public class Xing2 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������");
		double x=input.nextDouble();
		double y=input.nextDouble();
		System.out.println("���ֵ��"+(x>y?x:y)+"��Сֵ��"+(x<y?x:y));
		
	}
}
