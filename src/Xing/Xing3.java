package Xing;

import java.util.Scanner;

public class Xing3 {
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int x=input.nextInt(); 
		int y=input.nextInt();
		System.out.println("x�Ƿ�Ϊy�ı�����"+((x%y)==0));
		System.out.println("y�Ƿ�Ϊx��Լ����"+((x%y)==0));
	}
}
