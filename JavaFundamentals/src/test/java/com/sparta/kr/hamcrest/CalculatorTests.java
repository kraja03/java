package com.sparta.kr.hamcrest;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTests {

    @Test
        void given2And6_Add_Returns8Pt0() {
            Calculator calc = new Calculator(6, 2);
            assertEquals(8.0, calc.add());

            assertThat(calc.add(), is(8.0));

            // These are equivelant to the above
            assertThat("Failed", calc.add(), is(Matchers.equalTo(8.0)));
            assertThat(calc.add(), equalTo(8.0));

        }

        @Test
        void given6And3_DivisibleBy_ReturnsTrue() {
            Calculator calc = new Calculator(6, 2);
            Assertions.assertTrue(calc.divisibleBy());
            assertThat(calc.divisibleBy(), is(true));
        }

        @Test
        void given7And3_DivisibleBy_ReturnsFalse() {
            Calculator calc = new Calculator(7, 3);
            Assertions.assertFalse(calc.divisibleBy());
            assertThat(calc.divisibleBy(), is(false));
        }

        @Test
        void given7And3_ToString_OutputContainsCalculator() {
            Calculator calc = new Calculator(7, 3);
            Assertions.assertTrue(calc.toString().contains("Calculator"));
            assertThat(calc.toString(), containsString("Calculator"));
        }
    @Test
    void moreStringMatchers(){
        var testString = "The quick brown fox jumps over the lazy dog";

        //1. The string starts with "The"
        assertThat(testString, startsWith("The"));

        // 2. The string ends with "dog."
        assertThat(testString, endsWith("dog"));

        // 3. The string contains the string (ignoring case) "the quick
        assertThat(testString, containsStringIgnoringCase("the quick"));

        // 4. The string contains, in order, "quick", "jumps", "lazy"
        assertThat(testString, stringContainsInOrder(java.util.List.of("quick","jumps","lazy")));

        // 5. The string is not empty or null
        assertThat(testString, not(isEmptyOrNullString()));
    }

    @Test
    void collectionMatchersExercise(){
        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon"
        );
        assertThat(fruit, hasSize(7));

        assertThat(fruit.indexOf("apple") < fruit.indexOf("banana") &&
                fruit.indexOf("banana") < fruit.indexOf("pomegranate") &&
                fruit.indexOf("pomegranate") < fruit.indexOf("lemon"), is(true));


        assertThat(fruit, hasItems("banana", "pear"));

        assertThat(fruit, hasItems("lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"));

        assertThat(fruit, not(hasItem("grape")));

        assertThat(fruit, everyItem(not(endsWith("z"))));


        /**
         * Assert the following in the test method using MatcherAssert@
         * 1. There are 7 elements in the collection
         * 2. The collection contains the following items in this order: ["apple", "banana", "pomegranate", "lemon"]
         * 3. The collections contains ["banana", "pear"] in any order
         * 4. The collection contains the following items (they must be in this order in your assertion): ["lemon", "pineapple", "pomegranate", "apple", "peach", "pear", "banana"].
         * 5. The collection does not contain "grap"
         * The collection does not contain an item that ends with the letter "z"
         */
    }

}

