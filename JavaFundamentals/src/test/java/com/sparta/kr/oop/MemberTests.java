package com.sparta.kr.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MemberTests {

    @Test
    @DisplayName("getMemberDays returns the correct number of days since joining")
    public void getMemberDaysTest(){
        var today = LocalDate.now();
        var joinDate = today.minusDays(45);
        Member sut   = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertEquals(45, result);
    }

    @Test
    @DisplayName("getFirstName returns the correct first name")
    public void getFirstNameTest() {
        Member sut = new Member("Nish", "Mandal");
        Assertions.assertEquals("Nish", sut.getFirstName());
    }

    @Test
    @DisplayName("getLastName returns the correct last name")
    public void getLastNameTest() {
        Member sut = new Member("Nish", "Mandal");
        Assertions.assertEquals("Mandal", sut.getLastName());
    }

    @Test
    @DisplayName("getFullName returns first and last name combined")
    public void getFullNameTest() {
        Member sut = new Member("Nish", "Mandal");
        Assertions.assertEquals("Nish Mandal", sut.getFullName());
    }

    @Test
    @DisplayName("getFullName works when first or last name is empty")
    public void getFullNameEmptyTest() {
        Member m1 = new Member("", "Mandal");
        Assertions.assertEquals(" Mandal", m1.getFullName());

        Member m2 = new Member("Nish", "");
        Assertions.assertEquals("Nish ", m2.getFullName());
    }

    @Test
    @DisplayName("getFullName keeps whitespace in names")
    public void getFullNameWhitespace() {
        Member m = new Member("  Nish", "Mandal  ");
        Assertions.assertEquals("  Nish Mandal  ", m.getFullName());
    }

}
