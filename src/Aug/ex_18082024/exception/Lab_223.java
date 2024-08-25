package ex_18082024.exception;

public class Lab_223 {
    public static void main(String[] args) {
        Bank sbi=new Bank("INR",1000);
        Bank bm=new Bank("SGD",2000);
        Integer totalAmount=sbi.add(bm);
        System.out.println(totalAmount);
    }
}
