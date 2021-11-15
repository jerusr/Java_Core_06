package com.lgs.lab.interface2;

public class Main {

	public static void main(String[] args) {
		MyCalculator CX = new MyCalculator (25.4, 12.9);
		
		MyCalculator.viewCalcResult(CX.plus());
		MyCalculator.viewCalcResult(CX.minus());
		MyCalculator.viewCalcResult(CX.multiply());
		MyCalculator.viewCalcResult(CX.devide());

	}

}
