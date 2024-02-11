package javademos;

public class Methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	
	public static void sayiBulmaca() {
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
			mesajVer("Sayı mevcuttur: " + aranacakSayi);
		}
		else {
			mesajVer("Sayı mevcut değildir: " + aranacakSayi);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
