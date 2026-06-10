package practice2;

public class Product {
    String name;
    int price;

    Product(String someName, int somePrice){
        this.name = someName;
        this.price = somePrice;
    }
    String getName(){
        return this.name;
    }
    int getPrice(){
        return this.price;
    }
    void setPrice(int newPrice){
        this.price = newPrice;
    }
    void applyDiscount(int discount){
        this.price = this.price - (this.price * discount/100);
    }
    void printInfo(){
        System.out.println("Продукт " + this.name + ", итоговая цена составляет " + this.price);
    }
}
