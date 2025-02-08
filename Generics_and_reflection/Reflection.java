package Generics_and_reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
//动态获取和改变未知信息
//运行时动态加载class
//可以获取类的信息
//可以使用它来创建对象，不需要知道constructor
//可以操作private的对象

//homework：在github上传
class Person{
	private String name;
	public Person(String name) {
		this.name = name;
	}
	public void hello(){
		System.out.println("Hello, "+ name);
	}
}
class Animal{
	private String type;
	public Animal(String type) {
		this.type = type;
	}
	public void speak(){
		System.out.println("Hello, "+ type);
	}
}

public class Reflection {
	public static void main(String[] args) throws Exception{//查有没有问题,替代try catch,直接告诉在哪里有问题
		//搜一下exception
		//在不知道class的信息的情况下动态加载类
		Class<?> class1 = Class.forName("Generics_and_reflection.Person");//类的全限定constructor
		Method[] method1 = class1.getDeclaredMethods();
		for (Method methods : method1) {
			System.out.println(methods);
		}
		
		Class<?> class2 = Class.forName("Generics_and_reflection.Animal");
		Constructor<?> constructor1 = class2.getConstructor(String.class);
		Object animal1 = constructor1.newInstance("Cat");
		Method method2 = class2.getMethod("speak");
		method2.invoke(animal1);
		
		
	}

}
