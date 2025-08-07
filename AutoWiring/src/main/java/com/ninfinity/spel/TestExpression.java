package com.ninfinity.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sp1")
public class TestExpression {
	
	@Value("#{11+22}")
	int a;
	@Value("#{2*4}")
	int b;

	@Value("#{T(java.lang.Math).PI}")
	double c;

	@Value("#{5<6}")
	boolean d;
	
	@Value("#{T(java.lang.Math).sqrt(100)}")
	double e;

	@Value("#{new java.lang.String('Ritesh')}")
	String myName;

	@Override
	public String toString() {
		return "TestExpression [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + ", myName=" + myName
				+ "]";
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}





}
