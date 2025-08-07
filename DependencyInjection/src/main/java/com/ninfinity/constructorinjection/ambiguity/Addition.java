package com.ninfinity.constructorinjection.ambiguity;

public class Addition {
	int n1,n2;
	
	Addition(double n1,double n2){
		System.out.println("Double Double Constructor");
		this.n1 = (int)n1;
		this.n2 = (int)n2;
	}
	
	Addition(int n1,int n2){
		System.out.println("Int Int Constructor");
		this.n1 = n1;
		this.n2 = n2;
	}
	
	Addition(String n1,String n2){
		System.out.println("String String Constructor");
		this.n1 = Integer.parseInt(n1);
		this.n2 = Integer.parseInt(n2);
	}
	
	void doSum() {
		System.out.println("n1 is : "+ n1);
		System.out.println("n2 is : "+ n2);
		System.out.println("Addition is : "+(n1+n2));
	}
}
