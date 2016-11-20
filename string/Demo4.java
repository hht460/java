package cn.njupt.string;

public class Demo4 {
	public static void main(String[] args) {
	  StringBuffer sb = new StringBuffer("jack");
	  sb.append(true);
	  sb.append('a').append(97).append(new char[]{'a','b'});
	  System.out.println(sb.toString());
	  System.out.println(sb.indexOf("s",3));
	  System.out.println(sb.lastIndexOf("a"));
	  System.out.println(sb.substring(2));
	  sb.setCharAt(0,'s');
	  String str = sb.toString();  //´ÓStringBufferµ½String×ª»»
	}
}
