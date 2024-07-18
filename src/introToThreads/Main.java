package introToThreads;

public class Main {
    public static void main(String[] args) {
//        HelloWorldPrinter h = new HelloWorldPrinter();
//
//        for (int i = 0; i <= 10; i++) {
//            Thread t = new Thread(h);
//            t.start();
//        }

//        for (int i = 0; i <= 10; i++) {
//            NumberPrinter numPrinter = new NumberPrinter(i);
//            Thread t = new Thread(numPrinter);
//
//            t.start();
//        }

            Thread t = new HelloWorldPrinter2();
            t.start();
    }
}
