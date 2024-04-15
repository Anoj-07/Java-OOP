package OOP6.ExceptionHandling;

public class main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        //it specify block  and try all the things if any error occur it use catch or finally key word
        try {
            divide(a, b);
            //Exception is a class root of all exception so you can use it for all exception
            //for arithmetic exception you can use either exception or arithmeticException als well
        }
        //it catch the exception, used to handle the exception and at last it also use finally

        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        //it will run while exception thrown as well as exception not thrown
        //it basically means no matter happen it always executes
        finally {
            System.out.println("this is hero");
        }
    }

    /*
    * throws -> used to declare the exception or it may throws any exception
    * throw -> throwing the Exception*/
     static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("please do no divide by zero");
        }
        return a/b;
    }


}
