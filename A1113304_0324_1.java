import java.util.*;

class animal{
    String name;
    int height;
    int weight;
    int speed;

    void show(){
        System.out.println("name:"+name+"height:"+height+"Weight:"+weight+"speed:"+speed);
    }
    
    double distance(double x, double y){
        double distance = (x*y*this.speed);
        return distance;
    }

    double distance(double x){
        double distance = x*this.speed;
        return distance;
    }
}
public class A1113304_0324_1{
    public static void main(String [] argv){
        try (Scanner scanner = new Scanner(System.in)) {
            animal frozen1, frozen2, frozen3, frozen4;
            frozen1=new animal();
            frozen2=new animal();
            frozen3=new animal();
            frozen4=new animal();

            frozen1.name="雪寶";
            frozen1.height=(int)1.1;
            frozen1.weight=52;
            frozen1.speed=100;
            System.out.print("請輸入雪寶的時間(分鐘): ");
            double x = scanner.nextDouble();
            System.out.print("請輸入雪寶的加速度(沒有加速度的話輸入-1): ");
            double y = scanner.nextDouble();
            if(y == -1){
                double distance = frozen1.distance(x);
                System.out.println(frozen1.name + "跑了" + distance + "公尺");
                System.out.println();
            }else{
                double distance = frozen1.distance(x, y);
                System.out.println(frozen1.name + "跑了" + distance + "公尺");
                System.out.println();
            }

            frozen2.name="驢子";
            frozen2.height=(int)1.5;
            frozen2.weight=99;
            frozen2.speed=200;
            System.out.print("請輸入驢子的時間(分鐘): ");
            x = scanner.nextDouble();
            System.out.print("請輸入驢子的加速度(沒有加速度的話輸入-1): ");
            y = scanner.nextDouble();
            if(y == -1){
                double distance = frozen2.distance(x);
                System.out.println(frozen2.name + "跑了" + distance + "公尺");
                System.out.println();
            }else{
                double distance = frozen2.distance(x, y);
                System.out.println(frozen2.name + "跑了" + distance + "公尺");
                System.out.println();
            }

            frozen3.name="安那";
            frozen3.height=(int)1.7;
            frozen3.weight=48;
            frozen3.speed=120;
            System.out.print("請輸入安那的時間(分鐘): ");
            x = scanner.nextDouble();
            System.out.print("請輸入安那的加速度(沒有加速度的話輸入-1): ");
            y = scanner.nextDouble();
            if(y == -1){
                double distance = frozen3.distance(x);
                System.out.println(frozen3.name + "跑了" + distance + "公尺");
                System.out.println();
            }else{
                double distance = frozen3.distance(x, y);
                System.out.println(frozen3.name + "跑了" + distance + "公尺");
                System.out.println();
            }

            frozen4.name="愛沙";
            frozen4.height=(int)1.7;
            frozen4.weight=50;
            frozen4.speed=120;
            System.out.print("請輸入愛沙的時間(分鐘): ");
            x = scanner.nextDouble();
            System.out.print("請輸入愛沙的加速度(沒有加速度的話輸入-1): ");
            y = scanner.nextDouble();
            if(y == -1){
                double distance = frozen4.distance(x);
                System.out.println(frozen4.name + "跑了" + distance + "公尺");
                System.out.println();
            }else{
                double distance = frozen4.distance(x, y);
                System.out.println(frozen4.name + "跑了" + distance + "公尺");
                System.out.println();
            }
        }

        System.out.println();
    }
}