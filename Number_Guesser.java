import java.util.Random;
import java.util.Scanner;

class rando {
    int n, rnd, c = 0;
    Scanner sc = new Scanner(System.in);

    // Constructor for Random Number
    rando() {
        Random rn = new Random();
        rnd = rn.nextInt(100);
        // System.out.println(rnd);
    }

    // User Input
    public void userinput() {
        System.out.print("Enter a number => ");
        n = sc.nextInt();
        System.out.println();
        checker(n);
    }

    // Number of guesses
    public int guess() {
        c += 1;
        return c;
    }

    // Number checker
    public void checker(int n) {

        if (n > rnd) {
            System.out.println("[Try Lower....]");
            guess();
            userinput();
        } else if (n < rnd) {
            System.out.println("[Try Higher....]");
            guess();
            userinput();
        } else if (n == rnd) {
            System.out.printf(
                    " \t---------------------\nCONGRATS YOU'VE GUSSED THE CORRECT NUMBER\n\t--------------------- ");
            System.out.printf("\n\t[in %d guesses....]", guess() + 1);

        }
    }
}

class Number_Guesser {
    public static void main(String[] args) {
        rando obj = new rando();
        obj.userinput();
    }
}