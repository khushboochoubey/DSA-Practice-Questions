import java.util.*;
public class CalculateSum{
    // public static int fun1(int n){
    //     return n *(n+1)/2;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     fun1(n);
    //     System.out.println(fun1(n));
    // }



    // public static int fun2(int n){
    //     int sum = 0;
    //     for(int i = 1; i <=n;i++){
    //         sum=sum+i;
    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     fun2(n);
    //     System.out.println(fun2(n));
    // }


    public static int countBits(int n){
        int res = 0;
        while(n>0){
            n=(n&(n-1));
            res++;
        }
        return res; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        countBits(n);
        System.out.println(countBits(n));
    }

}