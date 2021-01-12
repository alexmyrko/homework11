public class FibonacciLoop {
    long n1;
    long n2;
    long sum;
    int n;

    public FibonacciLoop(int n){
        this.n = n;
    }

    public long execute(){
        for (int i = 0; i < n-1; i++){
            if (i == 0) {
                n1 = i;
                n2 = i + 1;
            }
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return sum;
    }
}
