package OOP6.ObjectComparision;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);
        return diff;

        //if diff == 0; means both are equal
        //if diff < 0 : menas o is bigger else o is smaller
    }
}

class main{
    public static void main(String[] args) {

        Student rahul = new Student(12, 89.22f);
        Student anoj = new Student(39, 96.22f);



        if (rahul.compareTo(anoj) < 0){
            System.out.println("anoj has more marks ");
            System.out.println(anoj.compareTo(rahul));
            System.out.println(rahul.compareTo(anoj));
        }
    }
}
