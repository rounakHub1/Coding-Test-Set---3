package mountain;

public class algorithm {

    private String arr, arr1st, arr2nd;
    private char[] arr2;
    private int ln, ln2, mid, mid2;
    private char temp;

    public void setArr(String arr) {
        this.arr = arr;
    }
    public void calculate() {

        ln = arr.length();
        if(ln % 2 == 0)
            mid = ln / 2;
        else
            mid = (ln - 1) / 2;

        arr1st = arr.substring(0, mid);
        arr2nd = arr.substring(mid);

        ln2 = arr2nd.length();
        mid2 = (ln2 % 2 == 0) ? (ln2 / 2) : ((ln2 - 1) / 2);

        arr2 = arr2nd.toCharArray();
        for(int i = 0; i < mid2; i++) {
            temp = arr2[ln2 - 1 - i];
            arr2[ln2 - 1 - i] = arr2[i];
            arr2[i] = temp;
        }
        arr2nd = "";
        arr2nd = String.copyValueOf(arr2);

        arr = "";
        arr = arr1st + arr2nd;
    }
    public String getArr() {
        return arr;
    }
}
