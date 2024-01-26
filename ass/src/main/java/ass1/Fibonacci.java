package ass1;

public class Fibonacci {
    public static void fibonacci(int n) {
        if (n == 0) {
            return;
        }
        if (n == 1) {
            System.out.println("1");
        }
        if (n >= 2) {
            System.out.printf("1, 1%s", n == 2 ? "." : ",");
        }
        int pre = 1;
        int curr = 1;
        for (int i = 0; i < n - 2; i++) {
            System.out.printf("%d+%d=%d%s", pre, curr, pre + curr,
                    i == n - 3 ? "." : ",");
            int temp = curr + pre;
            pre = curr;
            curr = temp;
        }
    }

    public static void main(String[] args) {
        fibonacci(100);
    }
}

