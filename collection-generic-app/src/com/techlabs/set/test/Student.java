package com.techlabs.set.test;

public class Student {
	private int id;
	private String name;
	private String job;

	public Student(int id, String name, String job) {
		this.id = id;
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
		return name;
	};

	@Override
	public int hashCode() {
		return id;
	};

	@Override
	public boolean equals(Object object) {
		Student student = (Student) object;

		if (this.id == student.id && this.name.equals(student.name)
				&& this.job.equals(student.job)) {
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}
}
