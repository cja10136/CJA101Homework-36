package hw4;

public class HW4_Q6_36 {
// 班上有8位同學，他們進行了6次考試結果如下(略表)，請算出每位同學考最高分的次數
	public static void main(String[] args) {
		int grade[][] = {
				{10,35,40,100,90,85,75,70},
				{37,75,77,89,64,75,70,95},
				{100,70,79,90,75,70,79,90},
				{77,95,70,89,60,75,85,89},
				{98,70,89,90,75,90,89,90},
				{90,80,100,75,50,20,99,75}
		};
		// 以下方法適用於沒有>1人得最高分的情境
		int times[] = {0, 0, 0, 0, 0, 0, 0, 0};
		int maxGrade, maxStudent;
		for(int i = 0; i < 6; i++) {
			maxGrade = grade[i][0];
			maxStudent = 0;
			for(int j = 1; j < 8; j++) {
				if(maxGrade < grade[i][j]) {
					maxGrade = grade[i][j];
					maxStudent = j;
				}
			}
			times[maxStudent]++;
		}
		System.out.println("每位同學考最高分的次數:");
		for(int k = 0; k < 8; k++) {
			System.out.printf("%d號:%d次\n", k+1, times[k]);
		}
		System.out.println();
	}
}
