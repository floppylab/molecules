package com.floppylab.molecules.contact;

import com.floppylab.molecules.exception.MoleculeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class EmailTest {

    @Test
    public void should_ValueEqual_When_ValidEmail() {
        Email email = new Email("test@test.org");
        Assert.assertEquals("test@test.org", email.getValue());
    }

    @Test(expected = MoleculeException.class)
    public void should_ThrowException_When_TooLongEmail() {
        Email email = new Email(String.join("", Collections.nCopies(254, "t")) + "@test.org");
    }

    @Test(expected = MoleculeException.class)
    public void should_ThrowException_When_InvalidEmail() {
        Email email = new Email("notAnEmail");
    }

}
