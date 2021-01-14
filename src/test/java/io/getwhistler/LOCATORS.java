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

//TODO======================================================CIDDashboardAfterSuccessfulAuthorizationPage========================================================

    String DASHBOARD_GENERAL_TABLES = "//li[@class='active'][.='Application Access Logs']";
    String LINK_IN_THE_LEFT_NAV_MENU = "//span[@class='nav-label'][.='$1']";
    String EXPANDED_MENU_AFTER_CLICKING_RISK_POLICIES_LINK = "//ul[@class='nav nav-second-level collapse in']";
    String LEXICONS_SUB_LINK = "//a[@href='/riskpolicies/lexicons']/i[@class='fa fa-book']";
    String LEXICONS_TITLE = "//h2[.='Lexicons']";
    String LEXICONS_NAME_FROM_THE_LEXICONS_LIST = "//td[@class='name-column font-bold']/a[.='$1']";
    String LEXICON_PAGE_BREADCRUMB = "//li[@class='active']/strong[.='$1']";
}
