package com.ninfinity.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Computer {
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Computer [price=" + price + "]";
	}

	public Computer(int price) {
		super();
		this.price = price;
	}

	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
