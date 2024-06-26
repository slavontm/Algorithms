import java.time.LocalTime;
import java.util.Arrays;

public class FibMemo2 {
    //  MemoFibonacci algoritm

    public static void main(String[] args) {
        int fib = 4;
        long[] mem = new long[fib + 1];
        Arrays.fill(mem, -1);
           System.out.println(LocalTime.now());
        System.out.println("FibNaive: " + fibNaive(fib, mem));


           System.out.println(LocalTime.now());
    }

    //O(n)
    public static long fibNaive(int n, long[] mem) {
        if (mem[n] != -1)  // проверка массива на уже вычисленный элемент экономит много времени!!!!! (~7 секунд на старом процессоре)
            return mem[n];
        if (n <= 1)          //   f(N) = { n=0 - 0, n=1 -1, n>1 - Fn-1+Fn-2 }
          return n;
        long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem); //recursive when non-effective for fib=45+ 10+ seconds
        mem[n] = result;
        return result;
    }
}
