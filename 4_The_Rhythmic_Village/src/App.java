import factorization.operations.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        find_GCD gcd = new find_GCD();
        find_LCM lcm = new find_LCM();

        System.out.println("\nEnter numbers (type any non-number to stop):");

        try {
            // Keeps reading until the user enters a non-integer
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
            int[] arr = list.stream().mapToInt(i -> i).toArray();

            gcd.setArr(arr);
            gcd.calculate();
            System.out.println("The Shared Pulse: " + gcd.getGCD());

            lcm.setArr(arr);
            lcm.calculate();
            System.out.println("The Grand Finale: " + lcm.getLCM() + "\n");

        } catch (Exception e) {
            System.out.println("ERROR");
        }

        sc.close();
    }
}
