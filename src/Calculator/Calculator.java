package Calculator;

import java.util.Scanner;

public class Calculator {

    // Fields
    private double number1;
    private double number2;
    private Character operator;
    private double total;

    // Constructor
    public Calculator() {
        this.number1 = 0;
        this.number2 = 0;
        this.operator = ' ';
    }

    // Getters
    public double getNumber1() {
        return number1;
    }
    public double getNumber2() {
        return number2;
    }
    public Character getOperator() {
        return operator;
    }

    public double getTotal() {
        return total;
    }

    // Setters
    public void setNumber1(int number1) {
        this.number1 = number1;
    }
    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public void setOperator(Character operator) {
        this.operator = operator;
    }

    // Methods
    public void addition() {
        this.total = this.number1 + this.number2;
    }
    public void subtraction() {
        this.total = this.number1 - this.number2;
    }
    public void multiplication() {
        this.total = this.number1 * this.number2;
    }
    public void division() {
        this.total = this.number1 / this.number2;
    }
}
