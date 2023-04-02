package domain;

import java.util.ArrayList;
import java.util.Scanner;

import dao.ProductDAO;
import dto.Product;

public class ProductMainApp {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Select mode of operation");
		System.out.println("1: Add Product");
		System.out.println("2: Delete Product");
		System.out.println("3: Display Products");
		
		int choice = sc.nextInt();
		
		System.out.println("---------------------------------------------------------");
		
		if(choice==1){
			insertProduct();
		}else if(choice==2){
			removeProduct();
		}else if(choice==3){
			showProducts();
		}else{
			System.out.println("Invalid choice");
		}		

	}
	
	static void insertProduct(){
		System.out.println("Enter product name: ");
		String name = sc.next();
		
		System.out.println("Enter product price: ");
		double price = sc.nextDouble();
		
		System.out.println("Enter Contact: ");
		long contact = sc.nextLong();
		
		//add data to DTO object
		Product p1 = new Product();
		p1.setProductName(name);
		p1.setProductPrice(price);
		p1.setContact(contact);
		
		//pass DTO object as argument to addProduct() method
		ProductDAO d1 =new ProductDAO();
		int count = d1.addProduct(p1);
		System.out.println(count+" PRODUCT INSERTED SUCCESSFULLY");
	}
	
	static void removeProduct(){
		System.out.println("Enter Product Id: ");
		int id=sc.nextInt();
		
		//add data to DTO object
				Product p1 = new Product();
				p1.setProductId(id);
				
				//pass DTO object as argument to addProduct() method
				ProductDAO d1 =new ProductDAO();
				int count = d1.deleteProduct(p1);
				System.out.println(count+" PRODUCT DELETED SUCCESSFULLY");
	}
	
	static void showProducts(){	
		ProductDAO p1 = new ProductDAO();
		ArrayList<Product> data = p1.displayProducts();
		for(Product p:data){
			System.out.println(p);
			
		}	
		System.out.println("PRODUCTS DISPLAYED SUCCESSFULLY");
	}

}
