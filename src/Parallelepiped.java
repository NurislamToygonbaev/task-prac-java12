import java.util.Scanner;

public class Parallelepiped {
    private int height;
    private int width;
    private int length;

    public Parallelepiped() {
    }

    public Parallelepiped(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void parSquere(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Enter height: ");
                setHeight(scanner.nextInt());
                System.out.print("Enter length: ");
                setLength(scanner.nextInt());
                System.out.print("Enter width: ");
                setWidth(scanner.nextInt());
                if (getLength() > 0 && getHeight() > 0 && getWidth() > 0){
                    break;
                }

            } catch (Exception e){
                System.out.println("Enter valid Integer");
            }
        }

        System.out.println("Аянты: "+ 2*((getHeight()*getLength())+(getLength()*getWidth())+(getHeight()*getWidth())));
        System.out.println("Колому: "+(getLength()*getHeight()*getLength()));
    }





    @Override
    public String toString() {
        return "Parallelepiped{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
