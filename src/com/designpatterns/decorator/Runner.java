package com.designpatterns.decorator;

public class Runner {

	public static void main(String[] args) {
		Beverage guinnes = new GuinnesBeverage();
		Beverage whipGuinnes = new Whip(guinnes);
		whipGuinnes = new Whip(whipGuinnes);
		System.out.println("Only guinnes coast: " + guinnes.coast());
		System.out.println(whipGuinnes.desciption() + " coast: " + whipGuinnes.coast());
	}
}
