package Aug.ex_18082024.collectionFramework;

import java.util.ArrayList;

public class Lab_238 {
    public static void main(String[] args) {
        Student student1=new Student(101,"Deepa");
        Student student2=new Student(102,"Vilas");
        Student student3=new Student(103,"Chavan");

        ArrayList arrayList= new ArrayList();
        arrayList.add(student1);
        arrayList.add(student2);
        arrayList.add(student3);
        //System.out.println(arrayList);      //[Aug.ex_18082024.collectionFramework.Student@5f184fc6, Aug.ex_18082024.collectionFramework.Student@3feba861, Aug.ex_18082024.collectionFramework.Student@5b480cf9]
        //After adding toString(),we will get below output.
        System.out.println(arrayList);         // [Student{id=101, name='Deepa'}, Student{id=102, name='Vilas'}, Student{id=103, name='Chavan'}]
    }
}

class Student
{
    private Integer id;
    private String studentName;

    Student(Integer id, String studentName) {
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
