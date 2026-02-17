package binary;

public class toOctal {

    private String num, octal;
    private int[] grp = new int[3];
    private int digit, i, j = 2;
    
    public void setNum(String num) {
        this.num = num;
    }
    public void calculate() {

        octal = "";
        for(i = num.length() - 1; i >= 0; i--) {

            if(j >= 0 && i > 0)
                grp[j--] = Character.getNumericValue(num.charAt(i));

            if(i == 0) {
                grp[j--] = Character.getNumericValue(num.charAt(i));
                while(j >= 0) {
                    grp[j--] = 0;
                }
            }
            if(j < 0) {
                j = 2;
                digit = (4 * grp[0]) + (2 * grp[1]) + (1 * grp[2]);
                octal = String.valueOf(digit) + octal;
            }
        }
    }
    public String getAnswer() {
        return octal;
    }
}
