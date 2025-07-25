package oops_inheritance;
import java.util.Scanner;
public class question3 {
	public static void main(String[] args) {
		Book book=new Book();
		book.setName("The One...");
		book.setPrice(1000.0);
		book.setQtyInStock(5);
		book.setAuthor(new Author("Janu","janu1412@gmail.com",'F'));
		System.out.println("Book Name: "+book.getName());
		System.out.println("Author Name: "+book.getAuthor().getName());
		System.out.println("Author Email: "+book.getAuthor().getEmail());
		System.out.println("Author Gender: "+book.getAuthor().getGender());
		System.out.println("Book Price: "+book.getPrice());
		System.out.println("Remaining Stock: "+book.getQtyInStock());
	}
}
class Author{
	String name;
	String email;
	char gender;
	Author(String name,String email,char gender){
		this.email=email;
		this.gender=gender;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public char getGender() {
		return gender;
	}
}
class Book{
	private String name;
	private Author author;
	private Double price;
	private int qtyInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
}

