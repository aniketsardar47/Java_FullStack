package com.Day9.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {
	public static void main(String[] args) throws Exception{
		Person p1 = new Person("Polo",21);
//		p1.print();
		
		Class pc = p1.getClass();
		System.out.println(pc.getName());
		System.out.println(pc.getPackageName());
		System.out.println(pc.getSuperclass());
//		Constructor[] constructors = pc.getConstructors();
//		System.out.println("List of Constructors");
//		for(Constructor c: constructors)
//			System.out.println(c);
//		
//		Method[] methods = pc.getMethods();
//		System.out.println("List of Methods");
//		for(Method m: methods)
//			System.out.println(m);
//		
//		Method[] dmethods = pc.getDeclaredMethods();
//		System.out.println("List of Declared Methods");
//		for(Method m: dmethods)
//			System.out.println(m);
		
		Field[] fields = pc.getDeclaredFields();
		System.out.println("List of Fields");
		for(Field f: fields)
			System.out.println(f);
	}
}


//JPA,Spring core,Spring Boot,Microservices,Reseliance,Dockers,