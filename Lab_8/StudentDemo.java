package Lab_8;

interface Sports {
    void putSportsScore(int score);
}

class Student {
    private int rollNum;
    private int marks;

    public void getRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public void putRollNum() {
        System.out.println("Roll Num: " + rollNum);
    }

    public void getMarks(int marks) {
        this.marks = marks;
    }

    public void putMarks() {
        System.out.println("Marks: " + marks);
    }

    public int getMarksValue() {
        return marks;
    }
}

class Result extends Student implements Sports {
    private int sportsScore;

    @Override
    public void putSportsScore(int score) {
        this.sportsScore = score;
    }

    public void displayResult() {
        putRollNum();
        putMarks();
        System.out.println("Sports Score: " + sportsScore);
        int total = getMarksValue() + sportsScore;
        System.out.println("Total Score: " + total);
    }
}


public class StudentDemo {
    public static void main(String[] args) {
        Result student1 = new Result();

        student1.getRollNum(101);
        student1.getMarks(85);
        student1.putSportsScore(15);

        System.out.println("Student 1 Result");
        student1.displayResult();
    }
}
