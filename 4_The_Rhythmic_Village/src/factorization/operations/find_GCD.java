package factorization.operations;

public class find_GCD {

    private int num, curr, sm, gcd;
    private int[] arr;

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void calculate() {

        num = arr[0];
        for(int i = 1; i < arr.length; i++) {
            curr = arr[i];

            sm = Math.min(num, curr);
            for(int j = 1; j <= sm; j++) {
                if(num % j == 0 && curr % j == 0)
                    gcd = j;
            }
            num = gcd;
        }
    }
    public int getGCD() {
        return gcd;
    }
}
