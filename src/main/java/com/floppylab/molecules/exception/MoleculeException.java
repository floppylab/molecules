package com.floppylab.molecules.exception;

import lombok.Getter;

public class MoleculeException extends RuntimeException {

    @Getter
    private String[] parameters;

    public MoleculeException(String message) {
        super(message);
    }

    public MoleculeException(String message, String... parameters) {
        this(message);
        this.parameters = parameters;
    }

}
