class Alphabet extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch+ ",");
        }
    }

    public static void main(String[] args) {
        Alphabet t = new Alphabet();
        t.start();
    }
}
