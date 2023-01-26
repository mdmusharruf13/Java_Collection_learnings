import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    public Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
}

public class M02_userDefinedClassObject {
    public static void main(String [] args){
        Student s1 = new Student(100,"james");
        Student s2 = new Student(200,"dennis");
        Student s3 = new Student(200,"guido van");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> itr = list.iterator();
        while(itr.hasNext()){
            Student std = itr.next();
            System.out.println(std.name+" : "+std.rollno);
        }
    }
}
