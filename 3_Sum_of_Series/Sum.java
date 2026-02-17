public class Sum {
    public void main(String[] args) {

        if (args.length != 1) {
            System.out.println("ERROR");
            return;
        }
        float sum = 0;
        try {
        
            int n = Integer.parseInt(args[0]);
            if (n <= 0) {
                System.out.println("ERROR");
                return;
            }

            for(int i = 1; i <= n; i++) {
                sum += (1.0 / i);
            }
            System.out.println(sum);
        } catch(NumberFormatException e) {
            System.out.println("ERROR");
        }
    }
}
