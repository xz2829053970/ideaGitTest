package Xing;

import java.util.Scanner;

public class Qukuanji {
	public static void main(String[] args) {
		int eDu=0;
		String kaHao="123";
		String miMa="123456";	
		Scanner input=new Scanner(System.in);
		int yuE=50000;
		boolean c=true;
		System.out.println("********ATMȡ���*********");
		System.out.println("��������п�");
	xiao: for(int a=3;a>0;a--){		
		String cha=input.next();
		System.out.println("���������룺");
		String shuRu=input.next();		
		if(miMa.equals(shuRu)&&kaHao.equals(cha)){	
			System.out.println("��¼�ɹ���");
			for(;;){

			System.out.println("��ѡ����Ҫ�����ҵ��:");
			System.out.println("1.���\t2.ȡ��\t3.�鿴���\t4.�޸�����\t5.�˳�");
				int xuanZe=input.nextInt();
			
			switch(xuanZe){
			case 1:
				while(true){
				System.out.println("��ѡ����Ҫ����Ľ�");
				int shuRu1=input.nextInt();
				if(shuRu1/10%10!=0||shuRu1%10!=0){
					System.out.println("�������ֻ�޴����٣��˳�"+((shuRu1/10%10*10)+(shuRu1%10))+"Ԫ");
					shuRu1=shuRu1-(shuRu1/10%10*10)-(shuRu1%10);
				}
				yuE=yuE+shuRu1;
				shuRu1=shuRu1/100*100;
				System.out.println("�ɹ����"+shuRu1+"Ԫ\n1.���ش���\t2.�˳�\t3.�Ƿ�������");
				int shuRu11=input.nextInt();
				if(shuRu11==1){
					break;
				}else if(shuRu11==2){
					System.out.println("�ɹ��˳�");
					System.exit(0);
				}
				}
			break;
			case 2:
				
				while(true){
				System.out.println("��ѡ����Ҫȡ���Ľ�");
				int shuRu2=input.nextInt();
				if(eDu>20000){
					System.out.println("�ѳ������������");
					break;
				}else if(eDu<=20000&&yuE>shuRu2&&(shuRu2/10%10==0&&shuRu2%10==0)){
					if(shuRu2<=5000){
						eDu+=shuRu2;
						if(eDu>20000){
							System.out.println("�ѳ������������");
							break;
							}
						yuE=yuE-shuRu2;
					System.out.println("�ɹ�ȡ��"+shuRu2+"Ԫ\n1.���ش���\t2.�˳�\t3.�Ƿ����ȡ��");
					int shuRu21=input.nextInt();
					if(shuRu21==1){
						break;
					}else if(shuRu21==2){
						System.out.println("�ɹ��˳�");
						System.exit(0);
					}
					}else {
						System.out.println("�����������������");
					}
				}else if(yuE<shuRu2){
					System.out.println("���㣬������");
				}else if(shuRu2/10%10!=0||shuRu2%10!=0){
					System.out.println("������ֻ��ȡ�����٣�������");
				}
				
				}	
			break;
			case 3:
				System.out.println("����ʣ"+yuE+"Ԫ");
				System.out.println("1.���ش���\t2.�˳�");
				int shuRu3=input.nextInt();
				if(shuRu3==1){
					continue;
				}else{
					System.out.println("�ɹ��˳�");
					System.exit(0);
				}
				
			break;
			case 4:
				
				System.out.println("������ԭ����");
				String	shuRu4=input.next();
				if(miMa.equals(shuRu4)){
					while(true){
				System.out.println("��ѡ����Ҫ�޸ĵ�����");
				String	shuRu41=input.next();
				System.out.println("ȷ������");
				String	shuRu42=input.next();
					if(shuRu41.equals(shuRu42)){
						miMa=shuRu41;
						System.out.println("�޸ĳɹ�,�����µ�¼");
						continue xiao; 
					}else{
						System.out.println("�������벻ƥ�䣬������");
					}
					}
					
				}else{
					System.out.println("ԭ��������������������");
				}
				break;
			default:
				System.out.println("�ɹ��˳�");
				System.exit(0);
			break;
			}	
			}
		}else{	
			if(a==0){	
				System.out.println("3�λ������꣬����������");
			}else{
				System.out.println("������󣬻���"+(a-1)+"�λ��ᣡ");
				
			}
		}
		}
	}
}
