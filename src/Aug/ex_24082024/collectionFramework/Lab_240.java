package Aug.ex_24082024.collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lab_240 {
    public static void main(String[] args) {
        StudentComparator student1=new StudentComparator(104,"Deepa");
        StudentComparator student2=new StudentComparator(102,"Vilas");
        StudentComparator student3=new StudentComparator(1011,"Chavan");

        ArrayList arrayList= new ArrayList();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        System.out.println(arrayList);         // [Student{id=104, name='Deepa'}, Student{id=102, name='Vilas'}, Student{id=1011, name='Chavan'}]

        System.out.println("****** Sort by Names ************");
        Collections.sort(arrayList,new sortByNames());
        System.out.println(arrayList);
        System.out.println("****** Sort by IDs ************");
        Collections.sort(arrayList,new sortByIDs());
        System.out.println(arrayList);
        System.out.println("****** Sort by IDs in Desc Order ************");
        Collections.sort(arrayList,new sortByIDDesc());
        System.out.println(arrayList);
    }
}

class sortByNames implements Comparator<StudentComparator>
{
    @Override
    public int compare(StudentComparator StudentComparator1, StudentComparator StudentComparator2) {
        return StudentComparator1.getStudentName().compareTo(StudentComparator2.getStudentName());
    }
}

class sortByIDs implements Comparator<StudentComparator>
{
    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
class sortByIDDesc implements Comparator<StudentComparator>
{
    @Override
    public int compare(StudentComparator o1, StudentComparator o2) {
        return o2.getId().compareTo(o1.getId());
    }
}
//Comparator interface method will be used to sort based on the member
class StudentComparator{


    private Integer id;
    private String studentName;

    StudentComparator(Integer id, String studentName) {
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
