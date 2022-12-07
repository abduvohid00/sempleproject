package ComparingSearching;

import java.util.*;

/*we will talk about Comparable and Comparator Interfaces to Sort information and there are two approachs to do this*/
public class Student implements Comparable<Student>/*TIP 1:by using Comparable Interface and its compareTo() abstract method we can achieve sorting*/ {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*here we created anonymous class using object called AGE_COMPARATOR of Comparator interface as well as we marked it as final */
    public static final Comparator<Student> AGE_COMPARATOR = new Comparator<>() {
        @Override
        public int compare(Student student1, Student student2) {
            if (student1.getAge() > student2.getAge()) {
                return -1;
            } else if (student1.getAge() < student2.getAge()) {
                return 1;
            } else {
                return 0;
            }
        }
    };

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*TIP 1:here we had override Interface's compareTo() abstract method*/
    @Override
    public int compareTo(Student student) {
        if (this.getAge() > student.getAge()) {
            return -1;
        } else if (this.getAge() < student.getAge()) {
            return 1;
        } else {
            return 0;
        }


    }
}

class Main {
    public static void main(String[] args) {
        var listOfStudent = new ArrayList<Student>();
        listOfStudent.add(new Student("Xusniddin", 22));
        listOfStudent.add(new Student("Shaxbozbek", 25));
        listOfStudent.add(new Student("Ravshanbek", 23));
        print(listOfStudent);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        /*Collection class has two method which is overloaded*/
        Collections.sort(listOfStudent, Student.AGE_COMPARATOR);
        print(listOfStudent);

    }

    public static void print(List<Student> list) {
        for (var student : list) {
            System.out.println(student.getName() + " : " + student.getAge());

        }
    }
}
