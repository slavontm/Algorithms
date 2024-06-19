import java.util.Arrays;
import java.util.Collections;

public class GreedyAlg {
    public static void main(String[] args) {
        int [] digits={3,1,7,9,9,5};
        System.out.println(maxNumDigit(digits));
    }

    public static String maxNumDigit(int[] digits) {
        // {3,1,7,9,9,5} ->{1,3,5,7,9,9}     - O(n*log(n)) - QuickSort;
        // {1,3,5,7,9,9} -> {9,9,7,5,3,1}    - O(n)

        // -> result= (n*log(n))
/*        Arrays.sort(digits);
        String result="";
        for (int i=digits.length-1; i>=0; i--){
            result+=digits[i];
        }
        return result;*/

        //LAMBDA JAVA 8 Advvanced

        return  String.join("",Arrays.stream(digits).boxed()
                .sorted(Collections.reverseOrder())
                .map(String::valueOf)
                .toArray(String[]::new));


    }

}
