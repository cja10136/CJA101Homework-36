// HW5_Q5_36
// done
package hw5;

public class MyRectangleMain {
//	請另外建立一個MyRectangleMain類別，此類別只有main方法
//	(1) 使用public MyRectangle()建構子建立物件，
//	設定width, depth為10, 20，透過getArea()印出結果
//	(2) 使用public MyRectangle(double width, double depth)建構子建立物件，
//	設定width, depth為10, 20，透過getArea()印出結果
	public static void main(String[] args) {
		MyRectangle rectangle1 = new MyRectangle();
		rectangle1.setWidth(10);
		rectangle1.setDepth(20);
		double area1 = rectangle1.getArea();
		System.out.println("area1:" + area1);
		
		MyRectangle rectangle2 = new MyRectangle(10, 20);
		double area2 = rectangle2.getArea();
		System.out.println("area2:" + area2);
	}
}
