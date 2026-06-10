package practice2;

public class Main {
    static void main(String[] args){

        Car firstCar = new Car("Мазда", 1998);
        firstCar.print();
        firstCar.setYear(2001);
        firstCar.print();

        //rectangle
        Rectangle figure = new Rectangle(18,21);
        System.out.println("Площадь прямоугольника " + figure.calculateArea());
        figure.setWidth(41);
        System.out.println("Площадь прямоугольника номер 2 " + figure.calculateArea());
        //book
        Book firstBook = new Book("Война и мир", "А.С.Пушкин");
        firstBook.printInfo();
        firstBook.setAuthor("Л.Н.Толстой");
        firstBook.printInfo();
        //bankaccount
        BankAccount wallet = new BankAccount("Евгений", 200000);
        wallet.deposit(5000);
        wallet.printBalance();
        wallet.withdraw(2500);
        wallet.printBalance();
        //point
        Point number = new Point(92, 10);
        number.print();
        number.setX(17);
        number.print();
        //student
        StudentGroup group = new StudentGroup("Альфа", 37);
        group.printInfo();
        group.setStudentCount(35);
        group.printInfo();
        //circle
        Circle figure2 = new Circle(12);
        figure2.printCalculateArea();
        figure2.printCalculateCircumference();
        figure2.setRadius(91);
        figure2.printCalculateArea();
        figure2.printCalculateCircumference();
        //teacher
        Teacher person = new Teacher("Владимир Анатольевич", "математика");
        person.printInfo();
        person.setSubject("ОБЖ");
        person.printInfo();
        //product
        Product article = new Product("Молоко", 100);
        article.printInfo();
        article.setPrice(120);
        article.applyDiscount(7);
        article.printInfo();
        //laptop
        Laptop device = new Laptop("Lenovo", 55000);
        device.printInfo();
        device.setPrice(60000);
        device.printInfo();
    }
}
