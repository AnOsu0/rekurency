package example1;

public class factorial {
    public static void main(String[] args) {
        int number = countFactorial(10);
        System.out.println(number);
    }
    private static int countFactorial(int n){
        return n>1 ? n*countFactorial(n-1) : 1;
    }


}

