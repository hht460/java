package cn.njupt.string;

import java.io.IOException;

public class Demo5 {
	public static void main(String[] args) throws IOException, InterruptedException{
		Runtime runtime = Runtime.getRuntime();
		Process process = runtime.exec("C:/Windows/System32/notepad.exe");
		Thread.sleep(3000);
		process.destroy();
		System.out.println(runtime.freeMemory());
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
	}
}
