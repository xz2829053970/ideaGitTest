package Xing;

import java.util.Scanner;

public class Xing {
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		System.out.println("������һ����λ��");
		int a=input.nextInt();
		int b=a%10,c=a/10%10,d=a/100%10,e=a/1000%10,f=a/10000%10;
		System.out.println("��λ����"+b);
		System.out.println("ʮλ����"+c);
		System.out.println("��λ����"+d);
		System.out.println("ǧλ����"+e);
		System.out.println("��λ����"+f);
		System.out.println("�ܺͣ�"+b+"+"+c+"+"+d+"+"+e+"+"+f+"="+(b+c+d+e+f));
		}
	}		