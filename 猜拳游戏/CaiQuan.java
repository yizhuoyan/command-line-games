package com.chinasofti.demo;
public class CaiQuan{
	public static void main(String[] args) {
		//���ʤ������
		int userWinCount=0;
		//����ʤ������
		int compWinCount=0;
	
		for(int i=1;i<11;i++){
			System.out.println("-----------��"+(i)+"��------------");
			//���Գ���
			int computer=(int)(Math.random()*3);//012
			//�û�����
			int user=Integer.parseInt(readLine("�����!(0ʯͷ,1��,2����)"));

			System.out.print("�����"+name(user)+"  VS  ���Ե�"+name(computer));
			//�жϽ��
			int result=judge(user,computer);

			System.out.print("=>�����:");	
			//��ʾ���
			switch(result){
				case 0://ƽ��
					System.out.println("ƽ��!");
					break;
				case 1://����ʤ��
					System.out.println("����ʤ��!");
					compWinCount++;
					break;
				case 2://���ʤ��
					System.out.println("��ʤ��!");
					userWinCount++;
					break;
			}
		}
		//���ͳ��
		System.out.println("��������10��,��ʤ����"+userWinCount+"��,����ʤ����"+compWinCount+"��");
		System.out.println("�������:");
		if(userWinCount>compWinCount){
			System.out.println("��ȵ��Դ���!");
		}else{
			System.out.println("���Ա������!");
		}

	}
	//������ת��Ϊ����
	private static String name(int type){
		switch(type){
			case 0:return "ʯͷ";
			case 1:return "��";
		}
		return "����";
	}
	/**
	*ʤ���ж�
	*0=ƽ��
	*1=����ʤ��
	*2=���ʤ��
	**/
	private static int judge(int user,int computer){
		if(user==computer){
			return 0;
		}
		switch(user){
			case 0://ʯͷ
				if(computer==1){//��
					return 1;
				}else{//����
					return 2;
				}	
			case 1://��
				if(computer==0){//ʯͷ
					return 2;
				}else{//����
					return 1;
				}
			default://����
				if(computer==0){//ʯͷ
					return 1;
				}else{//��
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