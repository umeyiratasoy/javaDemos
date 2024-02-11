package javademosClasses;

public class ProductManager {

	public void Add(Product product) { // bu kullanım doğru
		System.out.println("Ürün eklendi: " + product.getName());
	}
	
	public void Add2(int id, String name) { // bu kullanım yanlış
		System.out.println("Ürün eklendi: " + name);
	}
	
	public void Remove() {
		System.out.println("Ürün silindi");
	}
	
	public void Update() {
		System.out.println("Ürün güncellendi");
	}

}

