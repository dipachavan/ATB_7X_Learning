package ex_18082024.exception;

public class Bank {
    private String currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Bank bankName){
        if(!bankName.currency.equalsIgnoreCase("INR")){
            try {
                throw new Exception("Currency Mismatch");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Integer sum= this.amount + bankName.amount;
        return sum;
    }
}

/*

Exception in thread "main" java.lang.RuntimeException: java.lang.Exception: Currency Mismatch
	at ex_18082024.exception.Bank.add(Bank.java:33)
	at ex_18082024.exception.Lab_223.main(Lab_223.java:7)
Caused by: java.lang.Exception: Currency Mismatch
	at ex_18082024.exception.Bank.add(Bank.java:31)
	... 1 more


 */