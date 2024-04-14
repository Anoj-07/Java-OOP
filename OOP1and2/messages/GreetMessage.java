package OOP1and2.messages;

public class GreetMessage {
    public static void main(String[] args) {

}
    public static void message(){
        Student message = new Student("Anoj", 39, 93.2f);
        message = new Student("Rawal", 15, 90.2f);
        System.out.println(message.name +" "+ message.Rollno);
    }
}

// This is a class
class Student{
    String name;
    int Rollno;
    float marks;

    //This is a constructor


    public Student(String name, int rollno, float marks) {
        this.name = name;
        Rollno = rollno;
        this.marks = marks;
    }

    public Student(String name){
        this.name = name;
    }
}
