package net.mashrur.learning.javaee.cdi.Book.helper;

import net.mashrur.learning.javaee.cdi.Book.annotation.Digits;
import net.mashrur.learning.javaee.cdi.Book.annotation.NumberOfDigits;

@NumberOfDigits(value = Digits.EIGHT, odd=false)
public class IssnGenerator implements NumberGenerator {
}
