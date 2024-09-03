package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Lab_239 {
    public static void main(String[] args) {
        StudentComparble student1=new StudentComparble(104,"Deepa");
        StudentComparble student2=new StudentComparble(102,"Vilas");
        StudentComparble student3=new StudentComparble(1011,"Chavan");

        ArrayList arrayList= new ArrayList();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println(arrayList);         // [Student{id=104, name='Deepa'}, Student{id=102, name='Vilas'}, Student{id=1011, name='Chavan'}]
        Collections.sort(arrayList);
        //sorting as per id
        System.out.println(arrayList);          //[Student{id=1011, name='Chavan'}, Student{id=104, name='Deepa'}, Student{id=102, name='Vilas'}]

    }
}
//Comparable interface method will be used to sort based on the member
class StudentComparble implements Comparable<StudentComparble>
{


    private Integer id;
    private String studentName;

    StudentComparble(Integer id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + studentName + '\'' +
                '}';
    }
//    @Override
//    public int compareTo(StudentComparator otherObject) {
//        return Integer.compare(this.id,otherObject.id);       //will sort based on IDs of the student objects.
//    }

    @Override
    public int compareTo(StudentComparble otherObject) {
        return CharSequence.compare(this.studentName,otherObject.studentName);       //will sort based on student names of the student objects.
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setName(String name) {
        this.studentName = name;
    }


}
