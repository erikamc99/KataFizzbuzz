package dev.erika.FizzbuzzTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.Test;

import dev.erika.Fizzbuzz.Fizzbuzz;

import org.junit.jupiter.api.DisplayName;

public class FizzbuzzTest {
    @Test
    @DisplayName("Devuelve FizzBuzz si el número es divisible por 3 y por 5")
    void testIfdivisbleBy3And5_ReturnFizzBuzz() {
        
        // Given
        int num = 15;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When
        String result = fizzbuzz.checkNumber(num);

        // Then
        assertThat(result, is("FizzBuzz"));
        
    }   
    @Test
    @DisplayName("Devuelve Fizz si el número es divisible por 3")
    void testIfdivisbleByThree_ReturnFizz() {

        // Given
        int num = 9;
        Fizzbuzz fizzbuzz = new Fizzbuzz();

        // When
        String result = fizzbuzz.checkNumber(num);

        // Then
        
        assertThat(fizzbuzz, instanceOf(Fizzbuzz.class));
        assertThat(result, is("Fizz"));
        }   

        @Test
        @DisplayName("Devuelve Buzz si el número es divisible por 5")
        void testIfdivisbleByFive_ReturnBuzz() {
            
            // Given
            int num = 10;
            Fizzbuzz fizzbuzz = new Fizzbuzz();
    
            // When
            String result = fizzbuzz.checkNumber(num);
    
            // Then
            assertThat(result, is("Buzz"));
            
        }   

}

