package com.tka.calculator;

public class Operation {
	public double addTwo(double num1, double num2) {
		return (num1 + num2);
		}

	public double subTwo(double num1, double num2) {
		return (num1-num2);
		}

	public double mulpTwo(double num1, double num2) {
		return (num1*num2);
	}

	public double divTwo(double num1, double num2) {
		return (num1/num2);
	}

	public double modTwo(double num1, double num2) {
		return (num1%num2);
	}

	public double pwrTwo(double num1, double num2) {
		double res = 1;
		for (int i = 1 ; i <= num2; i++)
		{
			res *= num1;
		}
		return (res);
	}
	

}
