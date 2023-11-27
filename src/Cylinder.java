import java.util.Scanner;

public class Cylinder {
    private final int PI = 4;
    private int radius;
    private int height;
    private int width;

    public Cylinder() {
    }

    public Cylinder(int radius, int height, int width) {
        this.radius = radius;
        this.height = height;
        this.width = width;
    }

    public int getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


    public void cylinders(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter radius: ");
                setRadius(scanner.nextInt());
                System.out.print("Enter heigth: ");
                setHeight(scanner.nextInt());
                if (getHeight() > 0 && getRadius() > 0){
                    break;
                } else System.out.println(false);
            } catch (Exception e){
                System.out.println("Enter valid Integer");
            }
        }

        System.out.println("Цилиндр Аянты: "+ 2*PI*getRadius()*(getHeight() + getRadius()));
        System.out.println("Цилиндр колому: "+ (PI*getRadius()*getRadius()*getHeight()));
    }



    @Override
    public String toString() {
        return "Cylinder{" +
                "PI=" + PI +
                ", radius=" + radius +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
