package Calculator;

import java.util.Scanner;

public class Divide {

    public Double divide(double a, double b) throws MyException {
        if (b == 0) {
            throw new MyException();
        } else {
            return a / b;
        }
    }
}