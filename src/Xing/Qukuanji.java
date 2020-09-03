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
		System.out.println("********ATM取款机*********");
		System.out.println("请插入银行卡");
	xiao: for(int a=3;a>0;a--){		
		String cha=input.next();
		System.out.println("请输入密码：");
		String shuRu=input.next();		
		if(miMa.equals(shuRu)&&kaHao.equals(cha)){	
			System.out.println("登录成功！");
			for(;;){

			System.out.println("请选择您要办理的业务:");
			System.out.println("1.存款\t2.取款\t3.查看余额\t4.修改密码\t5.退出");
				int xuanZe=input.nextInt();
			
			switch(xuanZe){
			case 1:
				while(true){
				System.out.println("请选择你要存入的金额：");
				int shuRu1=input.nextInt();
				if(shuRu1/10%10!=0||shuRu1%10!=0){
					System.out.println("因此提款机只限存整百，退出"+((shuRu1/10%10*10)+(shuRu1%10))+"元");
					shuRu1=shuRu1-(shuRu1/10%10*10)-(shuRu1%10);
				}
				yuE=yuE+shuRu1;
				shuRu1=shuRu1/100*100;
				System.out.println("成功存款"+shuRu1+"元\n1.返回大厅\t2.退出\t3.是否继续存款");
				int shuRu11=input.nextInt();
				if(shuRu11==1){
					break;
				}else if(shuRu11==2){
					System.out.println("成功退出");
					System.exit(0);
				}
				}
			break;
			case 2:
				
				while(true){
				System.out.println("请选择你要取出的金额：");
				int shuRu2=input.nextInt();
				if(eDu>20000){
					System.out.println("已超额，请明天再来");
					break;
				}else if(eDu<=20000&&yuE>shuRu2&&(shuRu2/10%10==0&&shuRu2%10==0)){
					if(shuRu2<=5000){
						eDu+=shuRu2;
						if(eDu>20000){
							System.out.println("已超额，请明天再来");
							break;
							}
						yuE=yuE-shuRu2;
					System.out.println("成功取款"+shuRu2+"元\n1.返回大厅\t2.退出\t3.是否继续取款");
					int shuRu21=input.nextInt();
					if(shuRu21==1){
						break;
					}else if(shuRu21==2){
						System.out.println("成功退出");
						System.exit(0);
					}
					}else {
						System.out.println("数额过大，请重新输入");
					}
				}else if(yuE<shuRu2){
					System.out.println("余额不足，请重试");
				}else if(shuRu2/10%10!=0||shuRu2%10!=0){
					System.out.println("此提款机只能取出整百，请重试");
				}
				
				}	
			break;
			case 3:
				System.out.println("您还剩"+yuE+"元");
				System.out.println("1.返回大厅\t2.退出");
				int shuRu3=input.nextInt();
				if(shuRu3==1){
					continue;
				}else{
					System.out.println("成功退出");
					System.exit(0);
				}
				
			break;
			case 4:
				
				System.out.println("请输入原密码");
				String	shuRu4=input.next();
				if(miMa.equals(shuRu4)){
					while(true){
				System.out.println("请选择你要修改的密码");
				String	shuRu41=input.next();
				System.out.println("确认密码");
				String	shuRu42=input.next();
					if(shuRu41.equals(shuRu42)){
						miMa=shuRu41;
						System.out.println("修改成功,请重新登录");
						continue xiao; 
					}else{
						System.out.println("两次密码不匹配，请重试");
					}
					}
					
				}else{
					System.out.println("原密码输入错误，请从新输入");
				}
				break;
			default:
				System.out.println("成功退出");
				System.exit(0);
			break;
			}	
			}
		}else{	
			if(a==0){	
				System.out.println("3次机会用完，改天再来！");
			}else{
				System.out.println("密码错误，还有"+(a-1)+"次机会！");
				
			}
		}
		}
	}
}
