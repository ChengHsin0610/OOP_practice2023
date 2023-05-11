import java.util.*;

public class A1113304_0505{
    public static void main(String[] argv) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] winningNumbers = {6, 17, 24, 31, 41, 49};

        try {
            System.out.print("請輸入六個整數(1〜49): ");
            int[] inputNumbers = new int[6];
            for(int i=0 ; i<=5 ; i++){
                inputNumbers[i] = sc.nextInt();
                if (inputNumbers[i] < 1 || inputNumbers[i] > 49) {
                    throw new IllegalArgumentException("請輸入1~49之間的整數");
                }
            }
        }catch(IllegalArgumentException e){
            System.out.print("發生例外: " + e);
            System.out.print("請確定輸入的整數在1~49之間");
        }

        for(int i=0 ; i<=5 ; i++){
            if(inputNumbers[i] == winningNumbers[i]){
                System.out.print("恭喜中獎!!!");
            }else{
                System.out.print("沒中獎幫QQ");
            }
        }
    }
}
