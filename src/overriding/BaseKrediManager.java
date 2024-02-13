package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	public final double hesapla2(double tutar) { // final demek başka bir yansınıfında üzerine başka bir veri eklenemez olduğu gibi kullanılır yani
		return tutar * 1.18;
	}
}
