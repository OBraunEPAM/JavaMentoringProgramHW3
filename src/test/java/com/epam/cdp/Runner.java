package com.epam.cdp;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        testNG.addListener(new ITestNGListener() {
            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }
        });

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/testng.xml"));

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
