package com.chinasofti.demo;
public class CaiShu{
	public static void main(String[] args) {
		System.out.println("-----------------------");
		System.out.println("��ӭ�����������Ϸ!\n��Ϸ˵��:��Ϸ�������1-100֮�����,��ҽ��ж�β²�,��Ϸ��ʾ���С��Ŀ����,�³�Ϊֹ!");
		System.out.println("-----------------------");
		System.out.println();
		String ready=readLine("Are you Ready?(y/n):y>");
		if("n".equals(ready)){
			System.out.println("��Ϸ����");
			return;
		}
		//����Ŀ����
		int target=(int)(Math.random()*100)+1;
		//�²����
		int count=0;
		while(true){
			int input=Integer.parseInt(readLine("���������Ĳ²�>"));
			count++;
			if(input>target){
				System.out.print("��Ĳµ���̫����,");
				continue;
			}
			if(input<target){
				System.out.print("��Ĳµ���̫С��,");
				continue;
			}
			System.out.println("��ϲ��¶��ˣ��������ѽ������һ������"+count+"��,�������Ϊ"+(300-count*50));
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