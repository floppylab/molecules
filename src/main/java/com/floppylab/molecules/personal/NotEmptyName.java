package com.floppylab.molecules.personal;

import com.floppylab.molecules.exception.MoleculeException;

public class NotEmptyName extends Name {

    public NotEmptyName(final String value) {
        super(value);
    }

    @Override
    protected void validate(String value) {
        super.validate(value);
        if (value.length() < getMinimumLength()) {
            throw new MoleculeException("error.name.length.minimum", Integer.toString(getMinimumLength()));
        }
    }

    protected int getMinimumLength() {
        return 1;
    }
}
