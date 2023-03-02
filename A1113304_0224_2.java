import java.util.*;

public class A1113304_0224_2{
	public static void main(String[]argv){
	int C, F;

		System.out.print("請輸入攝氏溫度 :");
		Scanner sc = new Scanner(System.in);
		C = sc.nextInt();
		F = (C - 32) * 5 / 9;
		System.out.println("換算成華氏溫度為" + F);
	}
}		