package dev.erika.Fizzbuzz;

public class Fizzbuzz {
    public String checkNumber(int num) {

        boolean isDivisibleBy3And5 = num % 3 == 0 && num % 5 == 0;

        if (isDivisibleBy3And5) return "FizzBuzz";

        boolean isDivisibleBy3 = num % 3 == 0;

        if (isDivisibleBy3) return "Fizz";
        
        boolean isDivisibleBy5 = num % 5 == 0;
  
        if (isDivisibleBy5) return "Buzz";

        return num + "";
    }
}
