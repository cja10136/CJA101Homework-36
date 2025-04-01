package hw5_ext; // done

public class MainTest {
	public static void main(String[] args) {
		Pencil pencil = new Pencil("飛龍", 10);
		String pencilBrand = pencil.getBrand();
		double pencilPrice = pencil.getPrice();
		System.out.println(pencilBrand + pencilPrice);
		pencil.write();
		
		InkBrush inkBrush = new InkBrush("刷子牌", 50);
		String inkBbrushBrand = inkBrush.getBrand();
		double inkBbrushPrice = inkBrush.getPrice();
		System.out.println(inkBbrushBrand + inkBbrushPrice);
		inkBrush.write();
		
	}
}
