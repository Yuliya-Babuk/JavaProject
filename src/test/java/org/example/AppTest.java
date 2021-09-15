package org.example;

import org.junit.Test;

public class AppTest {

    @Test
    public void addContactNameTest() {
        AddcontactnameTest addcontactnameTest = new AddcontactnameTest();
        addcontactnameTest.setUp();
        addcontactnameTest.addcontactname();
    }

    @Test
    public void createProjectTest() {
        CreateprojectTest createprojectTest = new CreateprojectTest();
        createprojectTest.setUp();
        createprojectTest.createproject();
    }
}

