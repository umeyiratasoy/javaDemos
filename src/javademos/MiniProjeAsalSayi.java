package javademos;

public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 25;
		int remainder = number % 2; // kalan
		System.out.println(remainder);
		boolean isPrime = true;
		
		
		if (number == 1) {
			System.out.println("Asal Say Değildir");
			return;
		}
		
		if(number<2) {
			System.out.println("Geçersiz Sayı");
		}
		
		for (int i = 2; i < number; i++) {
			if (number % 2 == 0) {
				isPrime = false;
				
			}
			
		}
		
		if (isPrime) {
			System.out.println("Sayı Asaldır");
		}
		else {
			System.out.println("Sayi asal değil");
		}

	}

}
