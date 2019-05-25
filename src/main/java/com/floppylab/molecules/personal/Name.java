package com.floppylab.molecules.personal;

import com.floppylab.molecules.Molecule;
import com.floppylab.molecules.exception.MoleculeException;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Name extends Molecule<String> {

    private static final long serialVersionUID = 0L;

    public Name(final String value) {
        super(value);
    }

    @Override
    protected void validate(String value) {
        if (value.length() > getMaximumLength()) {
            throw new MoleculeException("error.name.length.maximum", Integer.toString(getMaximumLength()));
        }
    }

    protected int getMaximumLength() {
        return 100;
    }
}
