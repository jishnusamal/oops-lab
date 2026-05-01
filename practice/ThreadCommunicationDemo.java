class SharedData {
    int number = 1;
    boolean numberTurn = true; // controls alternation
}

class NumberThread extends Thread {
    SharedData data;

    NumberThread(SharedData data) {
        this.data = data;
    }

    public void run() {
        while (data.number <= 10) {
            synchronized (data) {
                while (!data.numberTurn) {
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (data.number > 10) {
                    data.notify();
                    break;
                }

                System.out.println("Number: " + data.number);

                data.numberTurn = false;
                data.notify();
            }
        }
    }
}

class SquareThread extends Thread {
    SharedData data;

    SquareThread(SharedData data) {
        this.data = data;
    }

    public void run() {
        while (data.number <= 10) {
            synchronized (data) {
                while (data.numberTurn) {
                    try {
                        data.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

                if (data.number > 10) {
                    data.notify();
                    break;
                }

                System.out.println("Square: " + (data.number * data.number));

                data.number++;
                data.numberTurn = true;
                data.notify();
            }
        }
    }
}

public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        Thread t1 = new NumberThread(data);
        Thread t2 = new SquareThread(data);

        t1.start();
        t2.start();
    }
}