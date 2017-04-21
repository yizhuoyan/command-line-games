package com.chinasofti.demo;
public class CaiShu{
	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("欢迎你玩猜数字游戏!\n游戏说明:游戏随机生成1-100之间的数,玩家进行多次猜测,游戏提示大或小于目标数,猜出为止!");
		System.out.println("-----------------------");
		System.out.println();
		String ready=readLine("Are you Ready?(y/n):y>");
		if("n".equals(ready)){
			System.out.println("游戏结束");
			return;
		}
		//生成目标数
		int target=(int)(Math.random()*100)+1;
		//猜测次数
		int count=0;
		while(true){
			int input=Integer.parseInt(readLine("请输入您的猜测>"));
			count++;
			if(input>target){
				System.out.print("你的猜的数太大了,");
				continue;
			}
			if(input<target){
				System.out.print("你的猜的数太小了,");
				continue;
			}
			System.out.println("恭喜你猜对了，你好厉害呀！！你一共猜了"+count+"次,你的智商为"+(300-count*50));
			break;
		}
			
	}
		
		
	public static String readLine(String tip) {
				try {
					System.out.println(tip);
					java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.InputStreamReader(
							System.in));
					return reader.readLine();
				} catch (Exception e) {}
				return null;
		}
}