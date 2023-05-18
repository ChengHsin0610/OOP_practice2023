import java.util.*;

class TimerThread extends Thread{
    int dumplingsPork = 5000;
    int dumplingsBeef = 3000;
    int dumplingsVegetable = 1000;
    int min_number = 10;
    int max_number = 50;
    int orderQuantity = (int) (Math.random() * 41) + 10;
    int dumplingType;
    int CustomerAttheSameTime;

    public void run(){
        Random random = new Random();
        for(int i=0;i<CustomerAttheSameTime;i++){
            dumplingType = random.nextInt(3);
            if(dumplingType == 0 && dumplingsPork > 0){
                dumplingsPork = dumplingsPork - orderQuantity;
            }else if(dumplingType == 1 && dumplingsBeef > 0){
                dumplingsBeef = dumplingsBeef - orderQuantity;
            }else if(dumplingType == 2 && dumplingsVegetable > 0){
                dumplingsVegetable = dumplingsVegetable - orderQuantity;
            }

            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void numberofDumplingsLeft(){
       if (dumplingsPork <= 0 && dumplingsBeef <= 0 && dumplingsVegetable <= 0) {
            System.out.println("水餃售完");
            System.exit(0);
        }
    }
}

public class A1113304_0512{
    public static void main(String[] argv) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("請輸入同時光顧的顧客數量：");
            int CustomerAttheSameTime = sc.nextInt();
        }
        TimerThread timerThread = new TimerThread();
        timerThread.start();

        try {
            timerThread.join();
        } catch (InterruptedException e) {
            
        }
        
        timerThread.numberofDumplingsLeft();
    }
}
