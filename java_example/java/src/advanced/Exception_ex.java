package advanced;
// 예외처리를 위한 연습문제
public class Exception_ex {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        String s = "이름";
        String[] sarray = new String[3];
        sarray[2] = "배열2번";

        try {
            s.toString();
            sarray[3] = "배열3번";
            System.out.println(3 / 0);
        } catch (NullPointerException npe) {
            System.out.println("스트링 객체가 참조하는 값이 없습니다.");
        } catch (ArrayIndexOutOfBoundsException aioe){
             System.out.println("3개까지만 입력할 수 있습니다.");
        } finally {
            System.out.println("정상적으로 종료됨");
        }


    }
}

            // exception이 발생할 가능성이 있는 문장을 try 안에 적는다.
//            Exception e = new Exception("고의로 발생시켰음");
//            throw e;
//            //System.out.println(3);
//        } //catch (ArrayIndexOutOfBoundsException aioe){
//        // System.out.println("3개까지만 입력할 수 있습니다.");
//        // }
//            catch (NullPointerException npe) {
//                System.out.println("스트링 객체가 참조하는 값이 없습니다.");
//            } catch (ArithmeticException ae) {
//                System.out.println("에러 메시지 : 숫자를 0으로 나누어서 발생한 오류입니다. 확인후 재입력하세요");
//            } //catch (Exception e) { // exception 이 발생하면 실행되는 곳
        // System.out.println("에러 메시지 : " + e.getMessage());
        //e.printStackTrace();
        //} // try-catch 마지막


