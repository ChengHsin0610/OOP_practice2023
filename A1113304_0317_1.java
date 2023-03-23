import java.util.*;

public class A1113304_0317_1 {
	public static void main(String [] argv){
        		System.out.println("請輸入n");
		try (Scanner sc = new Scanner(System.in)) {
           		int n = sc.nextInt();
            		System.out.println("請輸入m");
           		int m = sc.nextInt();

           		int[][] array = new int[n][m];
            		for(int i=0 ; i<array.length ; i++){
                    		for(int j=0 ; j<array[i].length ; j++){
                        			array[i][j] = i*array[i].length + j;
                  		}
		 }

               		for(int i=0 ; i<array.length ; i++){
                    		for(int j=0 ; j<array[i].length ; j++){
                        			System.out.print(array[i][j] + " ");
                    		}
                   		 System.out.println("\n");
                		}

                		for(int[] OneDim : array){
                    		for(int TwoDim : OneDim){
                        			System.out.print(TwoDim + " ");
                    		}
                    		System.out.print("\n");
                		}
       		}
	}
}