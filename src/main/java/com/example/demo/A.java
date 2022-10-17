package com.example.demo;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

/**
 * @Author: gq
 * @Date: 2022/9/14 16:35
 * @Version: V1.0
 */
public class A {

	public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

		printClass(new Date());

	}


	public static void printClass(Object o) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		System.out.println(o.getClass().getClassLoader());
		System.out.println(o.getClass().getConstructor().newInstance());
	}

}
