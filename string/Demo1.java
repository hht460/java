package cn.njupt.string;

public class Demo1 {
	public static void main(String[] args){
		Person p = new Person("tom", 12);
		Person p1 = new Person("tom", 12);
		System.out.println(p.equals(p1));
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
	}
}

class Person{
	private String name;
	private int age;
	//public Person(){}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){
		Person p = null;
		if(obj instanceof Person){
			p = (Person)obj;
		}
		if((this.name == p.name) && (this.age == p.age)){
			return true;
		}
		return false;
	}
	public int hashCode(){
		return this.name.hashCode() + this.age;
	}
	public String toString(){
		return this.name +" "+ this.age;
	}
}