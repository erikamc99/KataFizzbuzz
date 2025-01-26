package dev.erika;
import dev.erika.Fizzbuzz.Fizzbuzz;
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int num;
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        for (num = 1; num <= 100; num++) {
        System.out.println(fizzbuzz.checkNumber(num));
        }
    }
}
