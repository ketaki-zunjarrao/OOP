package com.techlabs.movable.test;

import com.techlabs.movable.IMovable;

public class Bike implements IMovable {

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}

}
