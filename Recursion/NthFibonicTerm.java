public class NthFibonicTerm {

    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int F_Minus_1 = fib(n - 1);
        int F_Minus_2 = fib(n - 2);
        int Fn = F_Minus_1 + F_Minus_2;
        return Fn;
    }
    public static void main(String args[]){
        int n = 5;
        System.out.println(fib(n));
    }
}
