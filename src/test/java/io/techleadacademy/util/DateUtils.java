package io.techleadacademy.util;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.support.PageFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public String getCurrentFormattedDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy");
        Date date = new Date();
        return formatter.format(date);
    }


}
