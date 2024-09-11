package bank;

import java.util.Arrays;

public class ReverseList {
    public static int[] reversealist(int[] number){
        int arrayBeginning = 0;
        int arrayEnd = number.length-1;

        while(arrayBeginning < arrayEnd){
            int temp = number[arrayBeginning];
            number[arrayBeginning] = number[arrayEnd];
            number[arrayEnd] = temp;
            arrayBeginning++;
            arrayEnd--;
        }
        return number;
    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int[] result = reversealist(number);
        System.out.println(Arrays.toString(result));
    }
}
