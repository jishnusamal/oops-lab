import static java.util.Math;
import java.util.Arrays;

interface Runnable {
    void sort();

    void reshape();
}

class Matrix implements Runnable {
    int size, rowSize;
    int[] oldMatrix;
    int[][] matrix;

    Matrix(int[] oldMatrix) {
        this.oldMatrix = oldMatrix;
        this.size = oldMatrix.length;
        this.rowSize = (int) Math.sqrt(size);
        matrix = new int[rowSize][rowSize];
    }

    @Override
    public void reshape() {
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                this.matrix[i][j] = this.oldMatrix[i * rowSize + j];
            }
        }
    }

    @Override
    public void sort() {
        Arrays.sort(this.oldMatrix);
    }
}

public class TwoDMatrix {
    public static void main(String[] args) {
        Matrix m = new Matrix(new int[] { 1, 7, 3, 6, 8, 9, 2, 5, 1 });
        m.sort();
        m.reshape();
        System.out.println(Arrays.deepToString(m.matrix));
    }
}
