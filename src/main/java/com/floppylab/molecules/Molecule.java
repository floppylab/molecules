package com.floppylab.molecules;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Embeddable
@NoArgsConstructor
public abstract class Molecule<T extends Serializable> implements Serializable {

    private static final long serialVersionUID = 0L;

    @Getter
    private T value = null;

    public Molecule(final T value) {
        validate(value);
        this.value = value;
    }

    /**
     * Sets the given value.
     * Before setting, validations run.
     *
     * @param value value to be set
     */
    public void setValue(final T value) {
        validate(value);
        this.value = value;
    }

    /**
     * Validates the given value.
     *
     * @param value value to be validated
     */
    protected abstract void validate(T value);

    /**
     * Checks if the reference is a null value.
     *
     * @return if the reference is null
     */
    public boolean isEmpty() {
        return value == null;
    }

    @Override
    public String toString() {
        String representation;
        if (isEmpty()) {
            representation = "";
        } else {
            representation = value.toString();
        }
        return representation;
    }

}
