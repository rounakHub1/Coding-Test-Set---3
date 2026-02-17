package series.operations;

public class fibonacci {

    private int index, preNum, postNum, tempNum, finalNum;

    public void setIndex(int index) {
        this.index = index;
    }
    public void calculate() {

        preNum = 1;
        postNum = 1;

        if(index == 1)
            finalNum = postNum;

        if(index > 1) {
            for(int i = 0; i < index - 2; i++) {

                tempNum = preNum + postNum;
                preNum = postNum;
                postNum = tempNum;
            }
            finalNum = postNum;
        }
    }
    public int getNum() {
        return finalNum;
    }
}
