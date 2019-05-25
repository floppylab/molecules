package com.floppylab.molecules.exception;

import lombok.Getter;

public class MoleculeException extends RuntimeException {

    @Getter
    private final String[] parameters;

    public MoleculeException(String message) {
        super(message);
        parameters = new String[0];
    }

    public MoleculeException(String message, String... parameters) {
        super(message);
        this.parameters = parameters;
    }

}
