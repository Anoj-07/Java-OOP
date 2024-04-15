package OOP7.Enums;

public interface EnumsInterface {
    void hello();
}

class Enums{
    enum inter implements EnumsInterface{
        ANOJ,
        Rawal;


        @Override
        public void hello() {
            System.out.println("hello enums");
        }
    }

}

class main{
    public static void main(String[] args) {
        Enums.inter en;
        en = Enums.inter.ANOJ;
        en.hello();
    }
}
