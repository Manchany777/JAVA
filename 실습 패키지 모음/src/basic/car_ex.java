package basic;

public class car_ex {
    public static void main(String[] args) {
        Car car = new Car(2022,"Red","Tesla","New");
        // 자동자 정보 출력
        System.out.println(car.getYear() + "년도에 출시된 "
                + car.getManufact() + "제조사의 "
                + car.getColor() + "색 " + car.getModel() + " 모델입니다.");

        car.setPower(true);  // 멤버변수(power) 변경 - 시동on
        car.setDirection(true); // 직진으로 drive 방향 변경
        car.setSpeed(60); // 멤버변수(speed) 변경
        car.drive(); // 직진주행중 메시지 출력
        car.stop(); // 멤버변수(speed) 변경과 멈춤 메시지 출력

        car.setDirection(false); // 후진으로 drive 방향 변경
        car.setSpeed(10);// 멤버변수(speed) 변경
        car.drive(); // 후진으로 메시지 출력
        car.stop(); // 멤버변수(speed) 변경과 멈춤 메시지 출력

        car.setPower(false);  // 멤버변수(power) 변경 - 시동off
    }
}
