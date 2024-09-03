package Aug.methodOverloading;

public class MathOperations {

    private String Name;
    private long phoneNum;
    //Encapsulation
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public MathOperations(String name, long phoneNum)
    {
        this.Name = name;
        this.phoneNum = phoneNum;
    }
    //Method Overloading
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    void add(int a, double b){
        System.out.println(a+b);
    }
    String add(String a,String b)
    {
        return a+b;
    }
    String add(String a,int b)
    {
        return a+b;
    }

}
