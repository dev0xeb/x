package Reflection;

public class ArrayClass {
    public static void main(String[] args) {
        int[][] number = {{1,1,0}, {0,1,0}, {1,1,0}};
        System.out.println(replaceValues(number));
    }
    public static String[][] replaceValues(int[][] number) {
        String[][] result = new String[number.length][number[0].length];
        for (int counter = 0; counter < number.length; counter++) {
            for (int row = 0; row < number[counter].length; row++) {
                result[counter][row] = (number[counter][row] == 1)? "*":" ";
            }
        }
        return result;
//        String result = "";
//        for (int counter = 0; counter < number.length; counter++) {
//            for (int index = 0; index < number[counter].length; index++) {
//                if (number[counter][index] == 1) {
//                    result += "*";
//                }else if(number[counter][index] == 0){
//                    result += " ";
//                };
//            }
//            result += "\n";
//        }
//        System.out.println();
//        return result;
    }
}