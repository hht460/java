package cn.njupt.string;

public class Demo2 {
	public static void main(String[] args){
		String str= "abcnodefnoghijklmnopqrstnocsfvc";
		System.out.println(reverse(str));
		System.out.println(getCount(str, "no"));
	}
	public static String reverse(String str){
		char[] chs = str.toCharArray();
		int start;
		int end;
		for(start=0,end=chs.length-1;start<=end;start++,end--){
			char temp = chs[start];
			chs[start] = chs[end];
			chs[end] = temp;
		}
		return new String(chs);
	}
	public static int getCount(String src, String tag){
		int index = 0;
		int count = 0;
		while((index = src.indexOf(tag)) != -1){
			System.out.println(src);
			src = src.substring(index + tag.length());
			System.out.println(src.length() + ": " + index + tag.length());
			count++;
		}
		return count;
	}
}
