// HW5_Q4_36 
// done
package hw5;

public class MyRectangle {
//	 請設計一個類別MyRectangle
	 private double width, depth;
	 
     public MyRectangle(double width, double depth) {
    	 this.width = width;
    	 this.depth = depth;
     }
     public MyRectangle() {}
     
	 void setWidth(double width) {
		 this.width = width;
	 }
	 void setDepth(double depth) {
		 this.depth = depth;
	 }
	 double getArea(){
		 return width*depth;
	 }
}
