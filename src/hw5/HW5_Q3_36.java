package hw5; // done

public class HW5_Q3_36 {
//	利用Overloading，設計兩個方法int maxElement(int x[][])與
//	double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳
	public static void main(String[] args) {
		int intArray[][] = {
				{1, 6, 3},
				{9, 5, 2}
		};
		double doubleArray[][] = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}	
		};
		int max1 = Work03.maxElement(intArray);
		double max2 = Work03.maxElement(doubleArray);
		System.out.println(max1);
		System.out.println(max2);
	}
}

class Work03{
	static int maxElement(int x[][]) {
		int max1 = x[0][0];
		for(int i = 0 ; i < x.length; i++)
			for(int j = 0; j < x[i].length; j++)
				if (max1 < x[i][j])
					max1 = x[i][j];
		return max1;
	}
	static double maxElement(double x[][]) {
		double max2 = x[0][0];
		for(int i = 0 ; i < x.length; i++)
			for(int j = 0; j < x[i].length; j++)
				if (max2 < x[i][j])
					max2 = x[i][j];
		return max2;
	}
}