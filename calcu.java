public class calcu {
    public static void main(String[] args){
        add(10, 10);
        sub(10, 5);
        multiply(10, 5);
        division(4, 4);
    }

    public static void add(int a, int b){
        int sum = a + b;
        System.out.println("The sum is: " +sum);
    }

    public static void sub(int a, int b){
        int res = a - b;
        System.out.println("The difference is: " +res);
    }

    public static void multiply(int a, int b){
        int res = a * b;
        System.out.println("The product is: " +res);
    }

    public static void division(int a, int b){
        int res = a / b;
        System.out.println("The quotient is: " +res);
    }
}
