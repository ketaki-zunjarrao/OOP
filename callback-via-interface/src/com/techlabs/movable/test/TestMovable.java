package com.techlabs.movable.test;

import java.sql.Date;

import com.techlabs.movable.IMovable;

public class TestMovable {

	public static void main(String[] args) {

		IMovable[] movable = { new Car(), new Truck(), new Bike() };
		startRace(movable);
	
	}

	private static void startRace(IMovable[] movables) {
		for (IMovable movable : movables) {
			movable.move();
		}
	}
}
