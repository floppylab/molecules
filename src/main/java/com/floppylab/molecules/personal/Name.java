package com.floppylab.molecules.personal;

import org.apache.commons.lang3.StringUtils;

import com.floppylab.molecules.Molecule;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Name extends Molecule<String> {

    private static final long serialVersionUID = 0L;

    public Name(final String value) {
        super(value);
    }

    @Override
    protected void validate(String value) {
        if (StringUtils.isEmpty(value)) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (value.length() < getMinimumLength()) {
            throw new IllegalArgumentException(String.format("Name cannot be shorter than %d", getMinimumLength()));
        }
        if (value.length() > getMaximumLength()) {
            throw new IllegalArgumentException(String.format("Name cannot be longer than %d", getMaximumLength()));
        }
    }

    protected int getMinimumLength() {
        return 1;
    }

    protected int getMaximumLength() {
        return 100;
    }
}
