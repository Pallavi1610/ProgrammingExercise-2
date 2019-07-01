package main.java.com.stackroute.pe2;

public class LongFactorial {
    public int factorial(int number) {
        int result = 1;
        if (number > 12)
            result = -1;
        else {
            while (number > 0) {
                result *= number;
                number--;
            }
        }
        return result;

    }
}
