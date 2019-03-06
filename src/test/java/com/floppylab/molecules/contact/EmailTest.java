package com.floppylab.molecules.contact;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

import static com.floppylab.molecules.contact.Email.EMAIL_MAXIMUM_LENGTH;

public class EmailTest {

    @Test
    public void should_ValueEqual_When_ValidEmail() {
        Email email = new Email("test@test.org");
        Assert.assertEquals("test@test.org", email.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_ThrowException_When_TooLongEmail() {
        Email email = new Email(String.join("", Collections.nCopies(EMAIL_MAXIMUM_LENGTH, "t")) + "@test.org");
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_ThrowException_When_InvalidEmail() {
        Email email = new Email("notAnEmail");
    }

}
