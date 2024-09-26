package com.akash.dhembare2000.ex_21092024.testngexamples;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG001 {


    @Severity(SeverityLevel.NORMAL)
    @Description("Veryfy that true == true")
    @Test
    public void testcase01(){
        Assert.assertEquals(true, true);
    }


    @Severity(SeverityLevel.BLOCKER)
    @Description("Veryfy that true != false")
    @Test
    public void testcase02(){
        Assert.assertEquals(true, true);
    }


}
