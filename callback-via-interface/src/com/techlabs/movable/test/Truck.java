package com.techlabs.movable.test;

import com.techlabs.movable.IMovable;

public class Truck implements IMovable {

	@Override
	public void move() {
		System.out.println("Truck is moving");
	}

}
