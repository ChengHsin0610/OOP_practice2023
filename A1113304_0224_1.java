import java.util.*;

public class A1113304_0224_1{
	public static void main(String[]argv){
		int integer;

		System.out.print("請輸入任意整數 :");
		Scanner sc = new Scanner(System.in);
		integer = sc.nextInt();
		
		if(integer % 2 == 1){	
			System.out.println("這是奇數");
		}else{

			System.out.println("這是偶數");
		}
	}
}
		