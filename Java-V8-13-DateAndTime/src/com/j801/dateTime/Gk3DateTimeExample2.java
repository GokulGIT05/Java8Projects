package com.j801.dateTime;

import java.time.LocalDateTime;

public class Gk3DateTimeExample2 {

	public static void main(String[] args) {

		// Represent Particular date and time
	LocalDateTime dtetme=LocalDateTime.of(2020, 05, 02, 12, 43);
	System.out.println(dtetme);
	
	// After 6 months
	System.out.println(dtetme.plusMonths(4));
	System.out.println(dtetme.minusMonths(2));

	}

}
