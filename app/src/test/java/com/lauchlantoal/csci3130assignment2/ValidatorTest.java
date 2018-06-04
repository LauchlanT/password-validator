package com.lauchlantoal.csci3130assignment2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void validateNotPassword() {
        Validator tester = new Validator();
        assertEquals(tester.validate("password"),1);
        assertEquals(tester.validate("PASSWORD"),1);
        assertEquals(tester.validate("pASSwORd"),1);
        assertEquals(tester.validate("notpassword"),2);
    }

    @Test
    public void validateProperLength() {
        Validator tester = new Validator();
        assertEquals(tester.validate(""),1);
        assertEquals(tester.validate("hello"),1);
        assertEquals(tester.validate("hello there"),2);
    }

    @Test
    public void validateNullHandling() {
        Validator tester = new Validator();
        assertEquals(tester.validate(null), 1);
    }
}