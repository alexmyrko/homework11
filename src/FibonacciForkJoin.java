import java.util.concurrent.RecursiveTask;

public class FibonacciForkJoin extends RecursiveTask<Long> {
    private long n;

    public FibonacciForkJoin(long n){
        this.n = n;
    }

    protected Long compute(){
        if (n <= 1)
            return n;
        else {
            FibonacciForkJoin fibonacciForkJoin1 = new FibonacciForkJoin(n - 1);
            fibonacciForkJoin1.fork();
            FibonacciForkJoin fibonacciForkJoin2 = new FibonacciForkJoin(n - 2);
            fibonacciForkJoin2.fork();
            return fibonacciForkJoin1.join() + fibonacciForkJoin2.join();
        }
    }

}
