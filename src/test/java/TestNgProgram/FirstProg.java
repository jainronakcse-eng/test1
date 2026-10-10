package TestNgProgram;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class FirstProg {

    @Test
    public void tc_001(){
        System.out.println("hi");
    }

    @Test (enabled = false)
    public void testCase1() {
        System.out.println("This is the A Normal Test Case");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }


// db connection
    // report connction
    // launch browser
    // enter username
    // enter password
    // click login button
    // verify info
    // quit
    // report publish
    // db connection


}
