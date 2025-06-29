class NamePrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Suman");
        }
    }

    public static void main(String[] args) {
        NamePrinter t = new NamePrinter();
        t.start();
    }
}
