package javademos;

public class StringsDemo {

	public static void main(String[] args) {
		//string fonksiyonları
		
		
		String mesaj = "Bugün hava çok güzel";
		
		System.out.println("Eleman sayisi" + mesaj.length()); // eleman karakter sayısı
		System.out.println("5. sayisi" + mesaj.charAt(5)); // kaçıncı eleman
		System.out.println(mesaj.concat(" Yaşasın")); // ekleme, birleştirme
		System.out.println(mesaj.startsWith("B")); // hangi harfle başlıyor
		System.out.println(mesaj.endsWith("l")); // hangi harfle bitiyor
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler); // belirlenen karakterleri gösterir
		System.out.println(mesaj.indexOf('a')); // a harfi kaçıncı indexte yani sırada olduğunu söyler.
		System.out.println(mesaj.lastIndexOf('e')); 
		
		System.out.println("--------------------------"); 
		
		
		System.out.println(mesaj.replace(' ', '-')); // boşluklara - ekler veya istenilen karakterleri değiştirir. 
		System.out.println(mesaj.substring(2)); //2.'inci intxten başlar
		System.out.println(mesaj.substring(2,4)); //2.'inci intxten başlar 4te bitirir
		
		for(String kelime : mesaj.split(" ") ) {
			System.out.println(kelime);
		} // boşlukları ayırıyor
		
		
		System.out.println(mesaj.toLowerCase()); // HEPSİ KÜÇÜK
		System.out.println(mesaj.toUpperCase()); // hepsi büyük
		
		System.out.println(mesaj.trim()); // baş ve sondaki boşlukları siler
		

	}

}
