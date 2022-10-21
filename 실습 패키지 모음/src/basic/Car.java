package basic;

public class Car {
    // 멤버변수
    public int year ;
    public String color;
    public String manufact;
    public String model;
    public int speed ;
    public boolean power; // true = 시동on, false=시동off
    public boolean direction; // true = 직진,false=후진
    // 생성자

    public Car(int year, String color, String manufact, String model) {
        this.year = year;
        this.color = color;
        this.manufact = manufact;
        this.model = model;
        this.speed = 0;
        this.power = false;
        this.direction = true;
    }


    // 게터, 세터

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufact() {
        return manufact;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if(isPower()){
            this.speed = speed;
        } else {
            System.out.println("경고 !! - 시동이 꺼져있습니다.");
        }
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {// 토글로 변경하기 !!
        this.power = power;
    }

    public boolean isDirection() {
        return direction;
    }

    public void setDirection(boolean direction) { // 토글로 변경하기
        if(isPower()){
            this.direction = direction;
        }else {
            System.out.println("경고 !! - 시동이 꺼져있습니다.");
        }
    }

    // method 구현
    public void drive(){
        if (isDirection()) {
            System.out.println(this.getSpeed() + "의 속도로 직진 주행중입니다.");
        } else {
            System.out.println(this.getSpeed() + "의 속도로 후진 주행중입니다.");
        }
    }
    public void stop(){
        this.speed = 0;
        System.out.println(this.speed + "의 속도로 정지했습니다.");
    }
}
