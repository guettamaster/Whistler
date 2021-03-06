package io.getwhistler;

import org.yecht.Data;

public interface LOCATORS {

//TODO======================================================SignInPage============================================================

    String EMAIL_ADDRESS_FIELD = "//input[@placeholder='Your Email Address']";
    String NEXT_BUTTON = "//span[@class='ladda-label'][.='Next']";
    String EMAIL_ABOVE_PASSWORD_FIELD = "//div[@class='form-sub-title'][.='$1']";
    String PASSWORD_FIELD = "//input[@placeholder='Enter your password']";
    String SIGNIN_BUTTON = "//span[@class='ladda-label'][.='Sign In']";

//TODO======================================================EMDInboxAfterSuccessfulAuthorizationPage==============================

    String USER_NAME_AFTER_SUCCESSFUL_AUTHORIZATION = "//strong[@class='font-bold'][.='$1']";
    String CATEGORIES_TITLE = "//h5[.='Categories']";


//TODO======================================================CIDDashboardAfterSuccessfulAuthorizationPage==========================

    String DASHBOARD_GENERAL_TABLES = "//li[@class='active'][.='Application Access Logs']";
    String LINK_IN_THE_LEFT_NAV_MENU = "//span[@class='nav-label'][.='$1']";
    String EXPANDED_MENU_AFTER_CLICKING_RISK_POLICIES_LINK = "//ul[@class='nav nav-second-level collapse in']";
    String LEXICONS_SUB_LINK = "//a[@href='/riskpolicies/lexicons']/i[@class='fa fa-book']";
    String FLAGS_SUB_LINK = "//a[@href='/riskpolicies/flags']/i[@class='fa fa-flag']";

//TODO======================================================RADashboardAfterSuccessfulAuthorizationPage===========================

    String DASHBOARD_TITLE = "//div[@class='selected-inbox-title'][contains(text(),'Open Issue')]";
    String SENT_MESSAGE_FROM_THE_YAHOO_MAIL = "(//a[@class='participant-name']/span[contains(text(),'Mike Foyle')]//ancestor::tr[@class='unread']//a[@class='communication-message'][contains(text(),'$1')])[1]";
    String HIGH_RISK_MESSAGE_ON_THE_OPEN_ISSUES_LIST = "(//a[@class='communication-message'][contains(text(),'$1')])[1]//ancestor::tr[@class='unread']//div/label[@_ngcontent-c10=''][contains(text(),'HIGH')]";

//TODO======================================================RAMessageDetailsPopup=================================================

    String MESSAGE_DETAILS_POPUP = "//div[contains(text(),'$1')]";
    String HIGH_RISK_LABEL_ON_THE_MESSAGE = "//div[contains(text(),'$1')]//ancestor::div[@class='modal-header']//label[@_ngcontent-c14=''][contains(text(),'HIGH')]";

//TODO======================================================CIDLexiconsPage=======================================================

    String LEXICONS_TITLE = "//h2[.='Lexicons']";
    String LEXICONS_NAME_FROM_THE_LEXICONS_LIST = "//td[@class='name-column font-bold']/a[.='$1']";

//TODO======================================================CIDLexiconPage========================================================

    String LEXICON_PAGE_BREADCRUMB = "//li[@class='active']/strong[.='$1']";
    String EDIT_LEXICON_BUTTON = "//a[@id='editLexicon']";
    String EDIT_LEXICON_POPUP = "//h3[@class='modal-title']";
    String SELECTED_NEVER_BLOCK_RADIO_BUTTON = "//label[@for='Unblocked']//ancestor::div[@class='radio radio-warning']/input[@id='IsBlocking']";

//TODO======================================================CIDFlagsPage==========================================================

    String FLAGS_TITLE = "//h2[.='Flags']";
    String FLAGS_NAME_FROM_THE_FLAGS_LIST = "//td[@class='name-column font-bold']/a[.='$1']";
    String HIGH_RISK_FLAG_ON_THE_FLAGS_LIST = "//a[@data-item-id='1982'][.='$1']//ancestor::tr//td[@class='text-uppercase']/span[contains(text(),'High')]";
    String FLAG_POPUP_VALUE = "//input[@id='Words'][@value='$1']";
    String HIGH_RISK_FLAG_INSIDE_THE_FLAG_POPUP = "//input[@value='$1']//ancestor::div[@class='modal-body']//label[@class='text-uppercase label-danger'][contains(text(),'High')]";

//TODO======================================================GoogleSearchPage======================================================

    String GOOGLE_INPUT_FIELD = "//input[@class='gLFyf gsfi']";

//TODO======================================================YahooMailboxPage======================================================

    String ENTER_BUTTON = "//a[@class='fuji-button-link fuji-button-text fuji-button-inverted']";
    String EMAIL_INPUT_FILED = "//input[@id='login-username']";
    String YAHOO_NEXT_BUTTON = "//input[@id='login-signin']";
    String EMAIL_ABOVE_PASSWORD_INPUT_FIELD = "//div[@class='yid'][.='$1']";
    String PASSWORD_INPUT_FIELD = "//input[@id='login-passwd']";
    String YAHOO_NEXT_BUTTON_BELOW_PASSWORD_FIELD = "//button[@id='login-signin']";
    String USER_ICON_ON_THE_MAILBOX_PAGE = "(//img[@alt='Profile image'])[1]";
    String EMAIL_AFTER_SUCCESSFUL_AUTHORIZATION = "//span[@class='_yb_1gh1f _yb_m78yl _yb_vpxpz'][.='$1']";
    String COMPOSE_BUTTON = "//a[@aria-label='Compose']";
    String SEND_MESSAGE_FORM = "//div[@data-test-id='compose-styler']";
    String TO_FIELD_IN_THE_MESSAGE_FORM = "//input[@id='message-to-field']";
    String SUBJECT_FIELD_IN_THE_MESSAGE_FORM = "//input[@aria-label='Subject']";
    String MESSAGE_FIELD_IN_THE_MESSAGE_FORM = "//div[@aria-label='Message body']";
    String SEND_BUTTON_IN_THE_MESSAGE_FORM = "//button[@title='Send this email']";


    String VIOLATION_WORD = "Value='$1'";
}
