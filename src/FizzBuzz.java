/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;

        while (i < 100) {
            doFizzBuzz(i);
            i++;
        }
    }

    public static void doFizzBuzz(int i) {
        // while loop

        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;      // = assigns variable but also function?
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {   // else if seems to be similar to python

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz"); // quotation for strings but no need to define

        } else {

            System.out.println(i);  //print to output

        }
    }
}
