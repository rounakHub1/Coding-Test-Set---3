import java.util.*;
import mountain.algorithm;

public class App {
    public static void main(String[] args) throws Exception {
        
        algorithm algo = new algorithm();
        Scanner sc = new Scanner(System.in);
        
        String arr, sortedArr;
        char[] tempArr;
        while (true) { 
            
            System.out.print("\nEnter the array (To stop, enter 'stop') : ");
            arr = sc.next();
            if(arr.equalsIgnoreCase("stop")) {
                System.out.println("\nThank you for staying with us.\nSee you soon...\n");
                break;
            }
            tempArr = arr.toCharArray();
            Arrays.sort(tempArr);
            sortedArr = new String(tempArr);

            algo.setArr(sortedArr);
            algo.calculate();
            System.out.println("The mountain is : " + algo.getArr() + ".\n");

            arr = "";
        }
        sc.close();
    }
}
