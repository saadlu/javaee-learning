package net.mashrur.learning.javaee.cdi.Book.helper;

import net.mashrur.learning.javaee.cdi.Book.annotation.Digits;
import net.mashrur.learning.javaee.cdi.Book.annotation.NumberOfDigits;

/**
 * Created by saad on 8/1/15.
 */

@NumberOfDigits(value = Digits.THIRTEEN, odd = false)
public class IsbnGenerator implements NumberGenerator {
}
