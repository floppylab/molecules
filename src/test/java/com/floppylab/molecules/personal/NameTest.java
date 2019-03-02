package com.floppylab.molecules.personal;

import org.junit.Assert;
import org.junit.Test;

public class NameTest {

    @Test
    public void simpleNameTest() {
        Name name = new Name("John Doe");
        Assert.assertEquals("John Doe", name.getValue());
    }
}
