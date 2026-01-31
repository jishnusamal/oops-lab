package Lab_3;

class Die {
    int sideUp;

    Die(int sideUp) {
        this.sideUp = sideUp;
    }

    Die() {
        this.sideUp = 1;
    }

    public int getSideUp() {
        return sideUp;
    }

    void roll() {
        this.sideUp = (int)(Math.random() * 6) + 1;
    }
}

public class DieDemo {
    public static void main(String[] args) {
        Die die1 = new Die();
        Die die2 = new Die();
        die1.roll();
        die2.roll();
        System.out.println("Sum: " + (die1.getSideUp() + die2.getSideUp()));
    }
}
