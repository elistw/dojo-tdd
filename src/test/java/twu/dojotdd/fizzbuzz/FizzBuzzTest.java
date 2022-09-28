package twu.dojotdd.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String convertedNumber = fizzBuzz.convert(number);

        assertEquals("Fizz", convertedNumber);
    }

    @Test
    public void shouldReturnBuzzWhenNumberIsMultipleOf5() {
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String convertedNumber = fizzBuzz.convert(number);

        assertEquals("Buzz", convertedNumber);
    }

    @Test
    public void shouldReturnTheSameNumberWhenNumberIsNotMultipleOf3Or5() {
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String convertedNumber = fizzBuzz.convert(number);

        assertEquals("1", convertedNumber);
    }

}
