package com.mybuddy;

import com.mybuddy.web.i18n.I18NService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybuddyApplicationTests {

    @Autowired
    private I18NService i18NService;

    @Test
    public void testMessagesLocaleService() throws Exception {
        String expectedResult = "Bootstrap starter template";
        String messageId="index.main.callout";
        String actual = i18NService.getMessage(messageId);
//        Assert.assertEquals("The actual and expected Strings don't match",expectedResult,actual);

    }

}
