class CountUpThread extends Thread {
    public void run() {
        for(int i = 0; i <= 50; i++) {
            System.out.println(i);
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        new CountUpThread().start();
        new CountUpThread().start();
        new CountUpThread().start();
    }
}
