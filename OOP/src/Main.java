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

    }
}