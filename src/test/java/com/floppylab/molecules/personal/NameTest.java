package com.floppylab.molecules.personal;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class NameTest {

    @Test
    public void should_ValueEqual_When_ValidName() {
        Name name = new Name("John Doe");
        Assert.assertEquals("John Doe", name.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_ThrowException_When_TooShortName() {
        Name name = new Name(String.join("", Collections.nCopies(Name.NAME_MINIMUM_LENGTH - 1, "n")));
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_ThrowException_When_TooLongName() {
        Name name = new Name(String.join("", Collections.nCopies(Name.NAME_MAXIMUM_LENGTH + 1, "n")));
    }

}
