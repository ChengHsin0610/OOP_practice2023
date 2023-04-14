import java.util.*;

class animal{
    String name;
    double height;
    int weight;
    int speed;

    public animal(String name, double height, int weight, int speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    void show(){
        System.out.println("name:"+name+"height:"+height+"Weight:"+weight+"speed:"+speed);
    }

    double distance(double x, double y){
        double distance = x*y*this.speed;
        return distance;
    }

    double distance(double x){
        double distance = x*this.speed;
        return distance;
    }

    public static String showinfo(){
        return "歡迎進入冰雪奇緣系統";
    }
}

class human extends animal{
    String sex;
    public human(String name, double height, int weight, int speed, String sex) {
        super(name, height, weight, speed); 
        this.sex = sex;
    }

    public human(String name, int height, int weight, int speed, String sex) {
        super(name, height, weight, speed); 
        this.sex = "X";
    }
    
    void show(){
        System.out.println("name:"+this.name+"height:"+this.height+"Weight:"+this.weight+"speed:"+this.speed+"sex:"+this.sex);
    }
}

class snow extends human{
    String iceSkill;
    public snow(String name, double height, int weight, int speed, String sex, String iceSkill) {
        super(name, height, weight, speed, sex); 
        this.iceSkill = iceSkill;
    }

    public snow(String name, int height, int weight, int speed, String sex, String iceSkill) {
        super(name, height, weight, speed, sex); 
        this.iceSkill = "X";
    }
    
    void show(){
        System.out.println("name:"+this.name+"height:"+this.height+"Weight:"+this.weight+"speed:"+this.speed+"sex:"+this.sex+"iceSkill:"+this.iceSkill);
    }

    double distance(double x, double y){
        double distance = x*y*this.speed*2;
        return distance;
    }

    double distance(double x){
        double distance = x*this.speed*2;
        return distance;
    }
}

public class A1113304_0331{
    public static void main(String [] argv){
        try (Scanner sc = new Scanner(System.in)) {
            animal.showinfo();

                    animal animal1 = new animal("雪寶", 1.1, 52,100);
                    animal1.show();
                    System.out.print("請輸入雪寶的時間(分鐘): ");
                    double x = sc.nextDouble();
                    System.out.print("請輸入雪寶的加速度(沒有加速度的話輸入0): ");
                    double y = sc.nextDouble();
                if(y == 0){
                    double distance = animal1.distance(x);
                    System.out.println(animal1.name + "跑了" + distance + "公尺");
                    System.out.println();
                }else{
                    double distance = animal1.distance(x, y);
                    System.out.println(animal1.name + "跑了" + distance + "公尺");
                    System.out.println();
                }

                animal animal2 = new animal("驢子", 1.5, 99, 200);
                    animal2.show();
                    System.out.print("請輸入驢子的時間(分鐘): ");
                    double x2 = sc.nextDouble();
                    System.out.print("請輸入驢子的加速度(沒有加速度的話輸入0): ");
                    double y2 = sc.nextDouble();
                if(y2 == 0){
                    double distance = animal2.distance(x2);
                    System.out.println(animal2.name + "跑了" + distance + "公尺");
                }else{
                    double distance = animal2.distance(x2, y2);
                    System.out.println(animal2.name + "跑了" + distance + "公尺");
                }

                human human1 = new human("阿克", 1.9, 80, 150,"男");
                    human1.show();
                    System.out.print("請輸入阿克的時間(分鐘): ");
                    double x3 = sc.nextDouble();
                    System.out.print("請輸入阿克的加速度(沒有加速度的話輸入0): ");
                    double y3 = sc.nextDouble();
                if(y3 == 0){
                    double distance = human1.distance(x3);
                    System.out.println(human1.name + "跑了" + distance + "公尺");
                }else{
                    double distance = human1.distance(x3, y3);
                    System.out.println(human1.name + "跑了" + distance + "公尺");
                }

                human human2 = new human("漢斯", 1.8, 78, 130,"男");
                    human2.show();
                    System.out.print("請輸入漢斯的時間(分鐘): ");
                    double x4 = sc.nextDouble();
                    System.out.print("請輸入漢斯的加速度(沒有加速度的話輸入0): ");
                    double y4 = sc.nextDouble();
                if(y4 == 0){
                    double distance = human2.distance(x4);
                    System.out.println(human2.name + "跑了" + distance + "公尺");
                }else{
                    double distance = human2.distance(x4, y4);
                    System.out.println(human2.name + "跑了" + distance + "公尺");
                }

                human human3 = new human("安那", 1.7, 48, 120,"女");
                    human3.show();
                    System.out.print("請輸入安那的時間(分鐘): ");
                    double x5 = sc.nextDouble();
                    System.out.print("請輸入安那的加速度(沒有加速度的話輸入0): ");
                    double y5 = sc.nextDouble();
                if(y5 == 0){
                    double distance = human3.distance(x5);
                    System.out.println(human3.name + "跑了" + distance + "公尺");
                }else{
                    double distance = human3.distance(x5, y5);
                    System.out.println(human3.name + "跑了" + distance + "公尺");
                }

                snow snow1 = new snow("愛沙", 1.7, 50, 120,"女","yes");
                    snow1.show();
                    System.out.print("請輸入愛沙的時間(分鐘): ");
                    double x6 = sc.nextDouble();
                    System.out.print("請輸入愛沙的加速度(沒有加速度的話輸入0): ");
                    double y6 = sc.nextDouble();
                if(y6 == 0){
                    double distance = snow1.distance(x);
                    System.out.println(snow1.name + "跑了" + distance + "公尺");
                }else{
                    double distance = snow1.distance(x6, y6);
                    System.out.println(snow1.name + "跑了" + distance + "公尺");
                }
        }
        }
}