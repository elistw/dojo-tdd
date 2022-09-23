package twu.dojotdd.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzWhenNumberIsMultipleOf3() {
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fizzBuzzOutput = fizzBuzz.execute(number);

        assertEquals("Fizz", fizzBuzzOutput);
    }

}
