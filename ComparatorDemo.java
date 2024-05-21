import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Implementation: A separate class typically implements the Comparator interface,
                or it can be implemented using anonymous classes or lambda expressions.
              : Implemented by a separate class
Multiple Sorting Sequences: By implementing Comparator, you can define multiple ways of comparing objects.
Sorting sequence: Defines custom orderings

Function: compare -
            Return Values:
                A negative integer if the first argument is less than the second.
                Zero if the first argument is equal to the second.
                A positive integer if the first argument is greater than the second.
 */
public class ComparatorDemo {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Rajat",23));
        studentList.add(new Student("Dilip", 24));
        studentList.add(new Student("Rahul", 20));
        studentList.add(new Student("Ankur", 18));

//IMPLEMENTING USING CLASSES
//        Collections.sort(studentList,new NameComparator());//sorting by name - either write this way
        studentList.sort(new NameComparator());//sorting by name - or write this way

        System.out.println("sorting by name");
        for(Student s : studentList){
            System.out.println(s);
        }
        System.out.println();

//        Collections.sort(studentList, new AgeComparator());//sorting by age - either write this way
        studentList.sort(new AgeComparator());//sorting by age - or write this way
        System.out.println("sorting by age");
        for(Student s : studentList){
            System.out.println(s);
        }

//IMPLEMENTING USING LAMBDA

        studentList.sort((s1,s2)->s1.name.compareTo(s2.name));
        studentList.sort((s1,s2)->Integer.compare(s1.age, s2.age));

        //also we can write this way - using Comparator.comparing

        studentList.sort(Comparator.comparing(s -> s.name));//sorting by name
        studentList.sort(Comparator.comparingInt(s -> s.age));//sorting by age


    }

    public static class Student{
        private String name;
        private int age;

        Student(String name, int age){
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

    }

    public static class NameComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    }

    public static class AgeComparator implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2){
            return Integer.compare(s1.age, s2.age);
        }
    }
}
