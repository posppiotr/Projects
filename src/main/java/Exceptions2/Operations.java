package Exceptions2;

import java.util.Random;

public class Operations {
    Random random = new Random();

    public void operation() throws MyException {
        System.out.println("Zaczynam operację");
        int chanceForMistake = random.nextInt(10);
        if (chanceForMistake > 5) {
            makeMistake();
        }
    }

    private void makeMistake() throws MyException{
    MyException exception = new MyException("Przeciałeś tętnicę");
        throw exception;
    }
}
