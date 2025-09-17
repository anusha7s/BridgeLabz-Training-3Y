package OOPSPracticeProblem.ObjectandClass.Level1;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void display() {
        System.out.println("Radius: " + radius + ", Area: " + area() + ", Circumference: " + circumference());
    }

    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.display();
    }
}

