package com.vishal.controller;

public class Demo extends Parent{
	public Demo(){
		System.out.println("child class");
	}
	public static void main(String[] args) {
		
		Parent parent = new Demo();
	}

}

abstract class Parent{
	public Parent() {
		System.out.println("hello parent");
	}
}
