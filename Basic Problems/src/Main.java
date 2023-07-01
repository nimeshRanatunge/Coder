public class Main {
    //prime numbers between x and y
    public static void main(String[] args) {
        int x = 10, y= 50;
        //11 13 17 19
        for(int i=x;i<y;i++){
            if(printIfPrime(i)) System.out.print(i+" ");
        }
    }

    private static boolean printIfPrime(int n) {
        if(n<=1) return false;
        else{
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0) return false;
            }
        }
        return true;
    }

}