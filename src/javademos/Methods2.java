package javademos;

import java.util.Iterator;

public class Methods2 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		int sayi = topla(1, 2);
		System.out.println(sayi);
		int toplam = topla2(1,2,3,4,5,6);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {  
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) { //çoklu parametre
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam +=sayi;
		}
		return toplam;
	}

}
