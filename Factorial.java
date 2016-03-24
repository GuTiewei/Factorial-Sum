public class Factorial {
    public static void main(String[]args) {
       for(int i = 1; i <= 20; i ++) {
           System.out.println(sum(i));
       }
    }
//1-n 阶乘和
    public static long sum(long n) {
        long sum = 0 ;
        long a0 = 1;
        long s0 = 0;
        for(int i = 1; i <= n ;i ++) {
            sum = s0 + a0 * i;
            a0 = a0 * i;
            s0 = sum;
        }
        return sum;
    }
}
