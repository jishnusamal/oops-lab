package Lab_8;

interface Series {
    int getNext();
    void reset();
    void setStart(int start); 
}

class ByTwos implements Series {
    private int start;  
    private int current; 

    ByTwos() {
        start = 0;
        current = 0;
    }

    @Override
    public int getNext() {
        current += 2;
        return current;
    }

    @Override
    public void reset() {
        current = start;
    }

    @Override
    public void setStart(int start) {
        this.start = start;
        this.current = start;
    }
}

public class SeriesDemo {
    public static void main(String[] args) {

        Series series = new ByTwos();

        series.setStart(10);
        System.out.println("Next 5 numbers in series starting from 10:");
        for (int i = 0; i < 5; i++) {
            System.out.print(series.getNext() + " ");
        }

        series.reset();
        System.out.println("\nAfter reset:");
        System.out.println(series.getNext());
    }
}
