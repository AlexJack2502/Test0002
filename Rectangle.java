public class Rectangle {

    private int width, height;

    public Rectangle(int w, int h) {
        if (w < 1 && h < 1)
            System.out.println("Width and height must be larger than 1");
        else {
            if (w > 0)
                width = w;
            else {
                width = 1;
                System.out.println("Width must be non-negative");
            }

            if (h > 0)
                height = h;
            else {
                height = 1;
                System.out.println("Height must be non-negative");
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void visualize() {
        for (int a = 1; a <= getHeight(); a++) {
            for (int b = 1; b <= getWidth(); b++) {
                if (b < getWidth())
                    System.out.print("*");
                else
                    System.out.println("*");
            }
        }
    }
}