package com.floppylab.molecules.contact;

import org.apache.commons.validator.routines.EmailValidator;

import com.floppylab.molecules.Molecule;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Email extends Molecule<String> {

    private static final long serialVersionUID = 0L;

    /*
        The maximum total length of a reverse-path or forward-path is 256 characters,
        including the punctuation and element separators”.
        Since addresses that don’t fit in those fields are not normally useful,
        the upper limit on address lengths should normally be considered to be 256,
        but a path is defined as: Path = “<” [ A-d-l “:” ] Mailbox “>”
        The forward-path will contain at least a pair of angle brackets in addition to the Mailbox,
        which limits the email address to 254 characters.
        https://www.ietf.org/rfc/rfc2821.txt
    */
    protected static final int MAXIMUM_LENGTH = 254;

    public Email(final String value) {
        super(value);
    }

    @Override
    protected void validate(String value) {
        if (value.length() > MAXIMUM_LENGTH) {
            throw new IllegalArgumentException(String.format("Email cannot be longer than %d", MAXIMUM_LENGTH));
        }
        if (!EmailValidator.getInstance(true).isValid(value)) {
            throw new IllegalArgumentException(String.format("Not a valid email address: [%s]", value));
        }
    }

}
