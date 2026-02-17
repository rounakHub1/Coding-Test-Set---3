package series.operations;

public class prime_numbers {

    private int index, primeNum, flag;

    public void setIndex(int index) {
        this.index = index;
    }
    public void calculate() {

        primeNum = 2;

        for(int i = 0; i < index; i++) {
            while (true) { 

                flag = 0;
                for(int j = 2; j < primeNum; j++) {
                    if(primeNum % j == 0) {
                        
                        flag = 1;
                        break;
                    }
                }
                primeNum++;
                if(flag == 0) {
                    break;
                }
            }
        }
    }
    public int getNum() {
        return primeNum - 1;
    }
}
