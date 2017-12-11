package com;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		cat1.cry();
		cat1.setAge(4);
		System.out.println(cat1.getAge());
		
		Animal cat = new Cat();
		cat.setAge(3);
		System.out.println(cat.getAge());
		cat.cry();
		
		Animal dog = new Dog();
		dog.cry();
	}

}
class Animal {
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
	public void cry(){
		System.out.println("不知道怎么叫");
	}
}

class Cat extends Animal
{
	public void cry(){
		System.out.println("喵喵");
	}
}

class Dog extends Animal
{
	public void cry()
	{
		System.out.println("汪汪");
	}
}
