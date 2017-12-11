package com;

public class Demo4 {

	/**
	 * @param args
	 * 
	 * 抽象类
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal1 cat = new Cat1();
		cat.cry();

	}

}

abstract class Animal1
{
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String name;
	int age;
	
	public abstract void cry();
}

class Cat1 extends Animal1{
	public void cry(){
		System.out.println("喵喵");
	}
	

	
}