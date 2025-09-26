package com.evaluation.part1;
class BasePage{
	String url="https://app.com";
	
	
}
class HomePage extends BasePage{
	String url="https://app.com/home";
	void base() {
		
		System.out.println("child "+url);
		System.out.println("parent "+super.url);
		
	}
	
}
public class BasePageQuestion {
	public static void main(String[] args) {
		HomePage hp=new HomePage();
		hp.base();
		
	}
}
