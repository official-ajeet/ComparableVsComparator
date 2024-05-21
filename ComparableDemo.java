import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Implementation: The class itself implements the Comparable interface, and it is used
                to compare the current object with another object of the same type.
Single Sorting Sequence: By implementing Comparable, you can define only one way of comparing objects.
Sorting Sequence: Defines the natural ordering
Implementation:	Implemented by the class being compared

Function: compareTo -
            Return Values:
                    A negative integer if the current object is less than the specified object.
                    Zero if the current object is equal to the specified object.
                    A positive integer if the current object is greater than the specified object.
 */

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rajat",23));
        studentList.add(new Student("Dilip", 24));
        studentList.add(new Student("Rahul", 20));
        studentList.add(new Student("Ankur", 18));

        //sorting the studentList
        Collections.sort(studentList);

        //printing the studentList
        for(Student s:studentList){
            System.out.println(s);
        }
    }

    public static class Student implements Comparable<Student> {
        private String name;
        private int age;

        private Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

//you can sort by name or age at a time

        //to sort by age
//        @Override
//        public int compareTo(Student other) {
//            return Integer.compare(this.age,other.age);
//        }

        //to sort by name
        @Override
        public int compareTo(Student other){
            return this.name.compareTo(other.name);
        }
    }
}
