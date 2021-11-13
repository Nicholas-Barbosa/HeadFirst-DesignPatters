package com.designpatterns.decorator;

public class Whip extends Decorator {

	public Whip(Beverage beverage) {
		super.target = beverage;
	}

	@Override
	public double coast() {
		// TODO Auto-generated method stub
		return super.target.coast() + .80;
	}

	@Override
	public String desciption() {
		// TODO Auto-generated method stub
		return "whip, " + super.target.desciption();
	}

}
