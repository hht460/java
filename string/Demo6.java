package cn.njupt.string;

import java.util.Random;

public class Demo6 {
	public static void main(String[] args){
		char[] chs = {'中', '国', 'a', 'j', '人', 'h'};
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		for(int i=0;i<4;i++){
			int index = rand.nextInt(chs.length);
			sb.append(chs[index]);
		}
		System.out.println("验证码: "+sb);
		Random rand1 = new Random();
		System.out.println(rand1.nextInt());
	}
}
