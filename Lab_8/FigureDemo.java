package Lab_8;

abstract class Figure {
    int x; 
    int y; 

    Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double area();
}

class Rectangle extends Figure {

    Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    double area() {
        return x * y; 
    }
}

class Triangle extends Figure {

    Triangle(int base, int height) {
        super(base, height);
    }

    @Override
    double area() {
        return 0.5 * x * y;
    }
}

class Square extends Figure {

    Square(int side) {
        super(side, side);
    }

    @Override
    double area() {
        return x * x; 
    }
}


public class FigureDemo {
    public static void main(String[] args) {

        Figure f1 = new Rectangle(10, 5);
        Figure f2 = new Triangle(6, 8);
        Figure f3 = new Square(4);
        System.out.println("Area of Rectangle: " + f1.area());
        System.out.println("Area of Triangle: " + f2.area());
        System.out.println("Area of Square: " + f3.area());
    }
    
}
