package com.floppylab.molecules.contact;

import com.floppylab.molecules.exception.MoleculeException;
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
    protected void validate(String value) {
        if (value.length() > getEmailMaximumLength()) {
            throw new MoleculeException("error.email.length.maximum", Integer.toString(getEmailMaximumLength()));
        }
        if (!EmailValidator.getInstance(true).isValid(value)) {
            throw new MoleculeException("error.email.format");
        }
    }

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
    protected int getEmailMaximumLength() {
        return 254;
    }

}
