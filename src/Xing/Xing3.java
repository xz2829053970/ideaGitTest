package Xing;

import java.util.Scanner;

public class Xing3 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个数：");
		int x=input.nextInt(); 
		int y=input.nextInt();
		System.out.println("x是否为y的倍数："+((x%y)==0));
		System.out.println("y是否为x的约数："+((x%y)==0));
	}
}
