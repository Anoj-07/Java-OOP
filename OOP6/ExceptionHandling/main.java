package OOP6.ExceptionHandling;

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        //it specify block  and try all the things if any error occur it use catch or finally key word
        try {
            int c = a /b;
            //Exception is a class root of all exception so you can use it for all exception
            //for arithmetic exception you can use either exception or arithmeticException als well
        }
        //it catch the exception, used to handle the exception and at last it also use finally

        catch (Exception e){
            System.out.println(e.getClass());
        }
        //it will run while exception thrown as well as exception not thrown
        //it basically means no matter happen it always executes
        finally {
            System.out.println("this is hero");
        }
    }
}
