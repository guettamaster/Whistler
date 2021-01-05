package io.getwhistler;

import org.yecht.Data;

public interface LOCATORS {

//TODO======================================================SignInPage========================================================

    String EMAIL_ADDRESS_FIELD = "//input[@placeholder='Your Email Address']";
    String NEXT_BUTTON = "//span[@class='ladda-label'][.='Next']";
    String EMAIL_ABOVE_PASSWORD_FIELD = "//div[@class='form-sub-title'][.='$1']";
    String PASSWORD_FIELD = "//input[@placeholder='Enter your password']";
    String SIGNIN_BUTTON = "//span[@class='ladda-label'][.='Sign In']";

//TODO======================================================EMDInboxAfterSuccessfulAuthorizationPage========================================================

    String USER_NAME_AFTER_SUCCESSFUL_AUTHORIZATION = "//strong[@class='font-bold'][.='$1']";
    String CATEGORIES_TITLE = "//h5[.='Categories']";
}
