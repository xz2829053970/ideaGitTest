package Xing;

import java.util.Scanner;

public class Xing {
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		System.out.println("请输入一个五位数");
		int a=input.nextInt();
		int b=a%10,c=a/10%10,d=a/100%10,e=a/1000%10,f=a/10000%10;
		System.out.println("个位数："+b);
		System.out.println("十位数："+c);
		System.out.println("百位数："+d);
		System.out.println("千位数："+e);
		System.out.println("万位数："+f);
		System.out.println("总和："+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+(b+c+d+e+f));
		}
	}		