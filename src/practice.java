public class practice {
    public static void main(String[] args) {
        int number = 0;
        int number2 = 1;
        for(int counter = 0; counter < 18; counter++) {
            int fibo = number + number2;
            System.out.println(fibo);
            number = number2;
            number2 = fibo;
        }
    }
}
