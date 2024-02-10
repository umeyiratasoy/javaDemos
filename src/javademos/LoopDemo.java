package javademos;

public class LoopDemo {

	public static void main(String[] args) {
		//for
				for (int i = 0; i < 10; i++) {
					System.out.println(i);
				}
				System.out.println(" forDöngü Bitti");

				
				//while 
				int i = 0;
				while (i<10) {
					System.out.println(i);
					i++;
				}
				System.out.println("while Döngü Bitti");

				
				//do-while
				int j = 2;
				do {
					System.out.println(j);
					j+=2;
				}  while (j<10);
				System.out.println(" do-while döngüsü Bitti");
				
	}

}
