import series.operations.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        if(args.length == 0) {
            System.out.println("ERROR");
            return;
        }
        fibonacci fibo = new fibonacci();
        prime_numbers prm = new prime_numbers();

        try {
            int n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.out.println("ERROR");
                return;
            }
            if(n % 2 == 0) {
                prm.setIndex(n / 2);
                prm.calculate();
                System.out.println(prm.getNum());
            }
            if(n % 2 != 0) {
                fibo.setIndex((n + 1) / 2);
                fibo.calculate();
                System.out.println(fibo.getNum());
            }
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
