package com.chinasofti.demo;
public class CaiQuan{
	public static void main(String[] args) {
		//玩家胜利次数
		int userWinCount=0;
		//电脑胜利次数
		int compWinCount=0;
	
		for(int i=1;i<11;i++){
			System.out.println("-----------第"+(i)+"轮------------");
			//电脑出招
			int computer=(int)(Math.random()*3);//012
			//用户出招
			int user=Integer.parseInt(readLine("请出招!(0石头,1布,2剪刀)"));

			System.out.print("你出的"+name(user)+"  VS  电脑的"+name(computer));
			//判断结果
			int result=judge(user,computer);

			System.out.print("=>结果是:");	
			//显示结果
			switch(result){
				case 0://平手
					System.out.println("平手!");
					break;
				case 1://电脑胜利
					System.out.println("电脑胜利!");
					compWinCount++;
					break;
				case 2://玩家胜利
					System.out.println("你胜利!");
					userWinCount++;
					break;
			}
		}
		//结果统计
		System.out.println("共比赛了10轮,你胜利了"+userWinCount+"次,电脑胜利了"+compWinCount+"次");
		System.out.println("最后结果是:");
		if(userWinCount>compWinCount){
			System.out.println("你比电脑聪明!");
		}else{
			System.out.println("电脑比你聪明!");
		}

	}
	//把数字转换为招数
	private static String name(int type){
		switch(type){
			case 0:return "石头";
			case 1:return "布";
		}
		return "剪刀";
	}
	/**
	*胜负判断
	*0=平手
	*1=电脑胜利
	*2=玩家胜利
	**/
	private static int judge(int user,int computer){
		if(user==computer){
			return 0;
		}
		switch(user){
			case 0://石头
				if(computer==1){//布
					return 1;
				}else{//剪刀
					return 2;
				}	
			case 1://布
				if(computer==0){//石头
					return 2;
				}else{//剪刀
					return 1;
				}
			default://剪刀
				if(computer==0){//石头
					return 1;
				}else{//布
					return 2;
				}
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