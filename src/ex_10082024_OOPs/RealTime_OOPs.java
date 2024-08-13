package ex_10082024_OOPs;

public class RealTime_OOPs
{
    public static void main(String[] args)
    {
        BaseTest baseTest= new TestCase();      //dynamic dispatch//Runtime--->Parent Reference with child object
        baseTest.setBrowser("FF",true);
        baseTest.openBrowser();
        baseTest.openBrowser("FF");
        baseTest.closeBrowser();
        baseTest.setBrowser("Edge",false);
        baseTest.closeBrowser();
        //BaseTest.sayHi();         //not accessible with parent reference
    }
}

class TestCase extends BaseTest
{
    //single inheritance- TestCase inherited from BaseTest
    TestCase()
    {
        super();
        this.setBrowser("OPERA",true);
    }
    //browser is private in parent
//    TestCase(String browser)
//    {
//        this.browser = browser;
//    }

    @Override
    //method overriding
    public void setBrowser(String browser, boolean isAuth) {
        super.setBrowser(browser,isAuth);
    }

    void sayHi(){
        System.out.println("Hiiii");
    }

}
class BaseTest
{
    private String browser;

    BaseTest() {
        System.out.println("DC-Parent");
    }
    BaseTest(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if(isAuth)
        {
            this.browser = browser;
            System.out.println(browser+" is set through authenticated user");
        }
        else System.out.println("Not Allowed as user is not allowed");
    }

    void closeBrowser()
    {
        System.out.println("Chrome Browser closed");
    }

    //Method overloading
    void openBrowser()
    {
        System.out.println("Default:Chrome Browser opened");
    }
    void openBrowser(String browserName)
    {
        System.out.println("Parameterized "+browserName+" Browser opened");
    }

}

//output:

/*

DC-Parent
OPERA is set through authenticated user
FF is set through authenticated user
Default:Chrome Browser opened
Parameterized FF Browser opened
Chrome Browser closed
Not Allowed as user is not allowed
Chrome Browser closed

*/