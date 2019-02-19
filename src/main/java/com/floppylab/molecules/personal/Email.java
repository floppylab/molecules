package com.floppylab.molecules.personal;

import org.apache.commons.validator.routines.EmailValidator;

import com.floppylab.molecules.Molecule;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Email extends Molecule<String> {

	private static final long serialVersionUID = 0L;

	public Email(final String value) {
		super(value);
	}

	@Override
	protected void validate(String email) {
		if(!EmailValidator.getInstance(true).isValid(email)) {
			throw new IllegalArgumentException(String.format("Not a valid email address: [%s]", email));
		}
	}

}
