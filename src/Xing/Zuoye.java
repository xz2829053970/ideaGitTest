package Xing;

import java.util.Scanner;

public class Zuoye {
	public static void main(String[] args) {
		int run=366,ping=365;
		Scanner input=new Scanner(System.in);
		do {
		System.out.println("������һ����ݣ�");
		int shuru=input.nextInt();
		if(shuru%4==0&&shuru%100!=0||shuru%400==0){
			int a=1;
			while(a<run){
				a++;
			}
			System.out.println(shuru+"����"+a+"��");
		}else{
			int b=1;
			while(b<ping){
				b++;
			}
			System.out.println(shuru+"����"+b+"��");
			}
		}while(true);
		
	}
}

