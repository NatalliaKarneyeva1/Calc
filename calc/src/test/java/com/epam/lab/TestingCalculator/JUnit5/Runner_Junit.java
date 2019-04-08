package com.epam.lab.TestingCalculator.JUnit5;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("JUnit Calculator suite")
@SelectPackages({"com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5"})
public class Runner_Junit {
}
