import binary.toOctal;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        toOctal oc = new toOctal();

        String bn;

        while (true) {
            System.out.print("Enter the binary no. (To stop, enter 'stop') : ");
            bn = sc.next();
            if(bn.equalsIgnoreCase("stop"))
                break;
            oc.setNum(bn);
            oc.calculate();
            System.out.println("In octal, " + bn + " is " + oc.getAnswer() + ".\n");
        }
    }
}
