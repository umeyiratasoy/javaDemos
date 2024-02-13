package javademosClasses;

public class Main {

	public static void main(String[] args) {
		
		

		Product product1 = new Product(2,"","",5000,3);
		
		
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		
		
		System.out.println(product.getKod());
		

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		productManager.Add2(1,"Laptop");
		

	}

}
