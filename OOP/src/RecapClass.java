/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2023/01/02
 * @desc
 */

// 클래스 기초를 복습하는 공간

class Person {
    String name;
    int age;

    void eat() {
        System.out.printf("%s는 오늘 붕어빵을 먹었습니다.", name);
        // 클래스 메소드
        // 클래스 필드의 사용 범위

    }
}



public class RecapClass {
    public static void main(String[] args) {

        // 객체 생성
        Person human = new Person();

        // name 필드의 기본값 변경
        human.name = "jongdroid";

        // 인스턴스 메소드 호출
        human.eat();
    }
}



