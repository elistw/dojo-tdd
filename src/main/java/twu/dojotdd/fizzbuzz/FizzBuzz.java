package twu.dojotdd.fizzbuzz;

public class FizzBuzz {
    public String convert(int number) {
        if (isMultipleOf3And5(number)) {
            return "FizzBuzz";
        }

        if (isMultipleOf3(number)) {
            return "Fizz";
        }

        if (isMultipleOf5(number)) {
            return "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isMultipleOf5(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOf3(int number) {
        return number % 3 == 0;
    }

    private boolean isMultipleOf3And5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }
}
