package com.floppylab.molecules.personal;

import com.floppylab.molecules.exception.MoleculeException;
import org.junit.Test;

public class NotEmptyNameTest {

    @Test(expected = MoleculeException.class)
    public void should_ThrowException_When_TooShortName() {
        NotEmptyName name = new NotEmptyName("");
    }

}
