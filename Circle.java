package practice2;

public class Circle {
    int radius;

    Circle(int someRadius){
        this.radius = someRadius;
    }
    int getRadius(){
        return this.radius;
    }
    void setRadius(int newRadius){
        this.radius = newRadius;
    }
    double calculateArea(){
        return Math.PI * radius * radius;
    }
    double calculateCircumference(){
        return 2 * Math.PI * radius;
    }
    void printCalculateArea(){
        System.out.println("Площадь круга = " + calculateArea());
    }
    void printCalculateCircumference(){
        System.out.println("Длина окружности = " + calculateCircumference());
    }
}
