package factorization.operations;

public class find_LCM {

    find_GCD gcd = new find_GCD();

    private int[] arr;
    private int lcm, curr, gc;

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public void calculate() {

        lcm = arr[0];
        for(int i = 1; i < arr.length; i++) {

            curr = arr[i];
            gcd.setArr(new int[] {lcm, curr});
            gcd.calculate();
            gc = gcd.getGCD();

            lcm = (lcm * curr) / gc;
        }
    }
    public int getLCM() {
        return lcm;
    }
}
