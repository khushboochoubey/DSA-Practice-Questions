import java.util.*;

public class isPal {
    public static boolean isPal(int n) {
    //   if(n == 0)
    //   return false;
    //   while(n != 1){
    //     if(n%2 != 0)
    //        return false;
    //     n=n/2;
    //   }
    // return true;

    if(n == 0)
    return false;
    return((n&(n-1))==0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPal(n);
        System.out.println(isPal(n)); 
    }
}//time complexity is theta(number of digits)
