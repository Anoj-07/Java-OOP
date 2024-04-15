package OOP6.ExceptionHandling;

public class CustomException extends Exception{
    public CustomException(String message) {
    super(message);
    }
}

class main2{
    public static void main(String[] args) throws CustomException{
        int a = 10;
        int b = 0;

        try {
            String name = "Anoj";


            if (name.equals("Anoj")){
                throw new CustomException("name is anoj");
            }
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("this is always execute");
        }
    }
}
