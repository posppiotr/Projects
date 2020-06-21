package Exceptions2;

public class Main {
    public static void main(String[] args) {
        Operations operations = new Operations();
        try {
            operations.operation();
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("Kauteryzacja");
        }
        finally{
            System.out.println("Operacja zakończona");
        }
    }
}
