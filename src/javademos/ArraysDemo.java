package javademos;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] ogrenciler = new String[]{"as1d","asd","asd"};
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
		}
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}

	}

}
