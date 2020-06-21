package Exceptions;

public class Exception {
    public static void main(String[] args) {
        String text = null;
        try{
            System.out.println(text.charAt(0));
        }
        catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Nie można odwoływać się do pól i metod obiektów, które są nullem");
        }
        System.out.println("test");
        Test test = new Test();
        test.test();
    }
}
