package Wednesday;

public class Box {
    double width;
    double height;
    double length;

    Box (double width, double height, double length){
        this.width = width;
        this.height = height;
        this.length = length;
    }
    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double Volume() {
        return width * height * length;
    }
}
