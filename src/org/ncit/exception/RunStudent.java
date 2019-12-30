package org.ncit.exception;

public class RunStudent {

	public static void main(String[] args) {
		Student student = new Student(-40);
		System.out.println(student);
	}
}
