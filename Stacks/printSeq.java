public class printSeq {

    public static void seq1(int n){
        if(n == 0){
            return;
        }
        seq1(n-1);
        System.out.println(n);
    }
    public static void seq2(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        seq1(n-1);
    }
    public static void main(String[] args) {
        int n = 5;

        // to print 1 to N
        seq1(n);

        // to print N to 1
        seq2(n);
    }
}
