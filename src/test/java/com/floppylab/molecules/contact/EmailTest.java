package com.floppylab.molecules.contact;

import com.floppylab.molecules.contact.Email;
import org.junit.Assert;
import org.junit.Test;

public class EmailTest {

    @Test
    public void simpleEmailTest() {
        Email email = new Email("test@test.org");
        Assert.assertEquals("test@test.org", email.getValue());
    }

}
