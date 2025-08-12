package FirstPractice.head02.example01;

public class OOPprogramming {
    public static void main(String[] args){
        Student[] students = {
                new Student("a", 42, 62),
                new Student("b", 61, 11),
                new Student("c", 94, 24)
        };

        for(Student student : students){
            System.out.println(student.name + " " + student.getAverage());
        }


    }
}
