package net.mashrur.learning.javaee.cdi.Book.services;

import net.mashrur.learning.javaee.cdi.Book.annotation.Digits;
import net.mashrur.learning.javaee.cdi.Book.annotation.NumberOfDigits;
import net.mashrur.learning.javaee.cdi.Book.helper.NumberGenerator;

import javax.inject.Inject;

/**
 * Created by saad on 7/30/15.
 */
public class BookService {

    @Inject @NumberOfDigits (value = Digits.THIRTEEN, odd = false)
    private NumberGenerator numberGenerator;
}
