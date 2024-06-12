package inhierarchy.shapes;

public class Recatangle {
     double width;
     double height;

    public Recatangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double calculateAreaOfRectangle()
    {
        return height*width;
    }
}
