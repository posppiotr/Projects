package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {

        Divide divide = new Divide();

        System.out.println(divide.divide(23, 0));
    }
}
