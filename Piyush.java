public class Piyush {
    
    public static void func(int n){
        if(n==6){
            return ; 
        }
        System.out.println(n);
        func(n+1) ; 
    }
    // sum of n natural numbers
    public static void sumOfN(int n , int sum){
       
         sum = 0 ; 
        if(n==0){
            System.out.println(sum);
            return ; 
        }
        sum = sum + n ; 
         
        sumOfN(n-1 , sum);
        
    }


    public static void main(String[] args) {
        // func(0) ; 
        sumOfN(5 , 0);
    }
}
