public class power {

    public static int Power(int x, int a){  // O(n)
        if(a == 0){
            return 1;
        }
        return x * Power(x, a-1);
    }

    public static int optimizedPower(int x, int a){  // O(log n)
        if( a == 0 ){
            return 1;
        }
        int halfPower = (optimizedPower(x, a/2));
        int halfPowerSq = halfPower * halfPower;
        if( a % 2 != 0){
            return x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String []args){
        System.out.println(Power(2,10));
        System.out.println(optimizedPower(2, 10));
    }
}
/*
    Simple Math 
    x^n = X^n/2 + X^n/2;
    if n == even

    if odd then 
    x^n/2 * x^n/2 * x

    
 */