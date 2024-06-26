public class FibNaive1 {
    // Fibonacci algiritm

    public static void main(String[] args) {
        int fib=10;
                System.out.println("FibNaive: "+ fibNaive(fib)+"\nFibEff: " + fibEff(fib) );
    }
    // O(2^n)
    public static long fibNaive(int n) {
        if(n<=1)          //   f(N) = { n=0 - 0, n=1 -1, n>1 - Fn-1+Fn-2 }
            return n;

        return fibNaive(n-1)+fibNaive(n-2); //recursive non-effective for 45+ 10+ seconds

    }
    // O(n)
    public static long fibEff(int n) {

        long[] arr =new long[n+1];  // O(n)

        //if(n<=1)          //   f(N) = { n=0 - 0, n=1 -1, n>1 - Fn-1+Fn-2 }
        //   return n;

        arr[0]=0; // O(1)
        if (n>0)
            arr[1]=1; // O(1)

        // O(n+n) = O(2n)= O(n)
        for(int i=2;i<=n; i++)
            arr[i]=arr[i-1]+arr[i-2];
        return arr[n]; // O(1)
        }
// O(n) = O(n)+O(1)+O(1)+O(n)+O(1) = O(2n)+O(3) = O(2n+3) = O(n)


    }
