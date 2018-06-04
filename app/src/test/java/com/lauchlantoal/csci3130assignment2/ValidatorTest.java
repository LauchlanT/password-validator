package com.lauchlantoal.csci3130assignment2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void validateNotPassword() {
        Validator tester = new Validator();
        assertEquals(tester.validate("password"),2);
        assertEquals(tester.validate("PASSWORD"),2);
        assertEquals(tester.validate("pASSwORd"),3);
        assertEquals(tester.validate("notpassword"),3);
    }

    @Test
    public void validateProperLength() {
        Validator tester = new Validator();
        assertEquals(tester.validate(""),1);
        assertEquals(tester.validate("hello"),2);
        assertEquals(tester.validate("hello there"),3);
    }

    @Test
    public void validateMultipleCases() {
        Validator tester = new Validator();
        assertEquals(tester.validate("what'shappening"),3);
        assertEquals(tester.validate("whAt'shappening"),4);
    }

    @Test
    public void validateContainsNumber() {
        Validator tester = new Validator();
        assertEquals(tester.validate("thisHasNoNumber"),4);
        assertEquals(tester.validate("thisHas1Number"),5);
    }

    @Test
    public void validateHasFourOrMoreNonDigits() {
        Validator tester = new Validator();
        assertEquals(tester.validate("273777288818736482yEh88"),4);
        assertEquals(tester.validate("This2828289819"),5);
    }

    @Test
    public void validateNullHandling() {
        Validator tester = new Validator();
        assertEquals(tester.validate(null), 1);
    }
}