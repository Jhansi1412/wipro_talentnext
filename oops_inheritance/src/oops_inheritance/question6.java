package oops_inheritance;
class Fruit {
 String name;
 String taste;
 String size;
 Fruit(String name, String taste, String size) {
     this.name = name;
     this.taste = taste;
     this.size = size;
 }
 void eat() {
     System.out.println("The fruit is " + name + " and it tastes " + taste + ".");
 }
}
class Apple extends Fruit {

 Apple(String size) {
     super("Apple", "sweet", size);
 }
 void eat() {
     System.out.println("The fruit is " + name + " and it tastes " + taste + ".");
 }
}
class Orange extends Fruit {

 Orange(String size) {
     super("Orange", "citrusy", size);
 }
 void eat() {
     System.out.println("The fruit is " + name + " and it tastes " + taste + ".");
 }
}
public class question6 {
 public static void main(String[] args) {
     Apple apple = new Apple("Medium");
     Orange orange = new Orange("Large");
     apple.eat();
     orange.eat();
 }
}
