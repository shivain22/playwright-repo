package org.example;

import java.nio.file.Paths;

import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;
import dashboard.customer.tests.CustomerTest;
import dashboard.org.tests.OrgTest;

public class App {
    public static void main(String[] args) {
        OrgTest orgTest = new OrgTest();
        orgTest.testOrg();
        CustomerTest customerTest = new CustomerTest();
        customerTest.testCustomer();
    }
}
