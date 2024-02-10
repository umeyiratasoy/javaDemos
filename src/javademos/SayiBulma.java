package javademos;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacakSayi = 5;
		boolean varMi = false;
		
		for (int sayi : sayilar) {
			if (sayi == aranacakSayi) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			System.out.println("Sayi Mevcuttur");
		}
		else {
			System.out.println("Sayi Mevcut değildir");
		}

	}

}
