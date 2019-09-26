package com.cg.corejava.stringio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise6 {

	public void dateDifferenceCalculator(LocalDate date) {
		long days = ChronoUnit.DAYS.between(LocalDate.now(), date);
		long months = ChronoUnit.MONTHS.between(LocalDate.now(), date);
		long years = ChronoUnit.YEARS.between(LocalDate.now(), date);
		System.out.println("Days : " + days);
		System.out.println("Months : " + months);
		System.out.println("Years : " + years);
	}

}
