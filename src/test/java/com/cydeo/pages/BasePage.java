package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.support.PageFactory;


//selenium page object module
public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
}
