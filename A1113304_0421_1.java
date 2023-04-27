import java.util.*;

public class A1113304_0421_1{
    public static void main(String[] argv) {
        try (Scanner sc = new Scanner(System.in)) {
            String email;
            boolean isEmail;
            do{
                isEmail = true;
                System.out.print("請輸入電子郵件地址：");
                email = sc.nextLine();

                if(!email.matches("[a-z]+@[a-z]+\\.[a-z]{2,}")){
                    System.out.println("電子郵件地址格式錯誤。");
                    isEmail = false;
                }
            } while (!isEmail);
        }
    }
}
        
        

    
