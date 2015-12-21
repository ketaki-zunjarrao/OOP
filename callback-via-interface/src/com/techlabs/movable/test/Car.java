package com.techlabs.movable.test;

import com.techlabs.movable.IMovable;

public class Car implements IMovable {

	@Override
	public void move() {
		System.out.println("Care is moving");
	}

}
