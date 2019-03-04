package com.floppylab.molecules.personal;

import com.floppylab.molecules.Molecule;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Name extends Molecule<String> {

    private static final long serialVersionUID = 0L;

    protected static final int MINIMUM_LENGTH = 1;
    protected static final int MAXIMUM_LENGTH = 100;

    public Name(final String value) {
        super(value);
    }

    @Override
    protected void validate(String value) {
        if (value.length() < MINIMUM_LENGTH) {
            throw new IllegalArgumentException(String.format("Name cannot be shorter than %d", MINIMUM_LENGTH));
        }
        if (value.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException(String.format("Name cannot be longer than %d", MAXIMUM_LENGTH));
        }
    }

}
