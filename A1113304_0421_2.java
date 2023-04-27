import java.util.*;

public class A1113304_0421_2{
    public static void main(String[] argv) {
        try (Scanner sc = new Scanner(System.in)) {
            String birthday;
            boolean isBirthday;
            do{
                isBirthday = true;
                System.out.print("請輸入生日(年/月/日或是月/日/年)：");
                birthday = sc.nextLine();

                if(!birthday.matches("[1,2]{1}[0,9]{1}[0-9]{2}+/[0,1]{1}[0-9]{1}+/[0,1,2,3]{1}[0-9]{1}")){
                    if(!birthday.matches("[0,1]{1}[0-9]{1}+/[0,1,2,3]{1}[0-9]{1}+/[1,2]{1}[0,9]{1}[0-9]{2}")){
                        System.out.println("生日格式錯誤。");
                        isBirthday = false;
                    }
                }
            } while (!isBirthday);
        }
    }
}