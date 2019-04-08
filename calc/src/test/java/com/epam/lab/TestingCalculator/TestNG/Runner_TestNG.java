package com.epam.lab.TestingCalculator.TestNG;

import com.epam.lab.TestingCalculator.TestNG.Listeners_TestNG.Listeners_TestNG ;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner_TestNG {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new Listeners_TestNG());

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/testngScopeTests.xml"));

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
