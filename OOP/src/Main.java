/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created ${DATE}
 * @desc
 */

public class Main {
    public static void main(String[] args) {

        // dog 객체 생성(인스턴스)
        // new 키워드를 사용한다.
        // 왼쪽의 Dog dog는 Dog타입의 변수를 의미한다.
        Dog dog = new Dog();

        // dog 객체의 필드를 출력한다. 하지만 값이 없기 때문에 null, 0 이 나올 것이다.
        // 왜 null하고 0 이 나올까? -> (정해진 기본 값이 있다.)
        // String의 기본 값은 = null
        // int의 기본 값은 = 0
        System.out.println(dog.age);
        System.out.println(dog.name);

        // dog 객체 필드의 기본 값을 변경해보자!
        // . 도트연산자를 사용한다.
        dog.age = 2;
        dog.name = "루루";

        // 기본 값이 아닌 변경한 값으로 출력한다.
        System.out.printf("강아지의 이름: %s\n", dog.name);
        System.out.printf("루루의 나이: %d\n", dog.age);

        // 목표 : Cat 클래스의 인스턴스 메소드를 호출해봅시다.

        // 우선 Cat 클래스를 객체로 만든다.
        Cat cat = new Cat();

        // 필드 호출과 동일하게 도트연산자를 통해 Cat 클래스에 있는 meow 메소드 내부를 실행한다.
        cat.meow();


        // 목표 : 필드를 사용한 인스턴스 메소드를 호출해보자
        Cat instanceCat = new Cat();

        // 필드의 초기값을 설정하지 않았기 때문에 null(String)이 기본 값으로 설정되어 있다.
        instanceCat.name = "루루";

        // 필드 (name)를 사용한 인스턴스 메소드를 호출해보자!
        instanceCat.eat();


        // 정사각형 클래스 실습
        // 출력 예 : 한 변의 길이가 4인 정사각형의 넓이 : 16

        // 객체를 먼저 만들어보자
        Square s1 = new Square();

        // 필드 값을 한 변의 길이 4로 지정
        s1.length = 4;

        // 바로 출력해보자
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", s1.length, s1.area());


    }
}