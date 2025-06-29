class Countdown extends Thread {
    public void run() {
        for (int i = 5; i >= 1; i--) {
            System.out.println("Countdown: " + i);
        }
    }

    public static void main(String[] args) {
        Countdown t = new Countdown();
        t.start();
    }
}
