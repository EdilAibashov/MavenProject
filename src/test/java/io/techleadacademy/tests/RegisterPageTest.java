package io.techleadacademy.tests;

import io.techleadacademy.pages.MyAccountPage;
import io.techleadacademy.pages.RegisterPage;
import io.techleadacademy.util.Waits;
import org.testng.annotations.Test;

public class RegisterPageTest extends RegisterPage {
    @Test
    public void verifyRegisterPageTitle(){
        RegisterPage regPage = new RegisterPage();
        navigateToRegisterPage();
        Waits.sleep(1000);
        registerNewUser();




    }
}
