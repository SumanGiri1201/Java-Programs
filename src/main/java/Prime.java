
class PrimePrinter extends Thread {
    int start, end;

    PrimePrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}

public class Prime {
    public static void main(String[] args) {
        PrimePrinter thread1 = new PrimePrinter(1, 50);
        PrimePrinter thread2 = new PrimePrinter(51, 100);

        thread1.start();
        thread2.start();
    }
}

