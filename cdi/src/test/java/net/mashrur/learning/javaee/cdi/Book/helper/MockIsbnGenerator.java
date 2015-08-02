package net.mashrur.learning.javaee.cdi.Book.helper;

import net.mashrur.learning.javaee.cdi.Book.annotation.Digits;
import net.mashrur.learning.javaee.cdi.Book.annotation.NumberOfDigits;

import javax.enterprise.inject.Alternative;

@Alternative @NumberOfDigits(value = Digits.EIGHT, odd=true)
public class MockIsbnGenerator implements NumberGenerator {
}
