package practice2;

public class Rectangle {
    int width;
    int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }
    int getHeight(){
        return this.height;
    }
    int getWidth(){
        return this.width;
    }
    void setWidth(int newWidth){
        this.width = newWidth;
    }
    int calculateArea(){
        return this.width * this.height;
    }
}
