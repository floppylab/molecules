package com.floppylab.molecules.personal;

import com.floppylab.molecules.exception.MoleculeException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class NameTest {

    @Test
    public void should_ValueEqual_When_ValidName() {
        Name name = new Name("John Doe");
        Assert.assertEquals("John Doe", name.getValue());
    }

    @Test
    public void should_ValueEqual_When_EmptyName() {
        Name name = new Name("");
        Assert.assertEquals("", name.getValue());
    }

    @Test(expected = MoleculeException.class)
    public void should_ThrowException_When_TooLongName() {
        Name name = new Name(String.join("", Collections.nCopies(101, "n")));
    }

}
