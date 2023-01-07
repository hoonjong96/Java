package Class;

/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2023/01/01
 * @desc
 */

// 클래스를 통해 생성된 객체를 인스턴스라고 하며
// 클래스의 메소드를 호출하는 것을 인스턴스 메소드를 호출한다고 표현한다.


// [2] 이번엔 필드의 스코프를 학습해보려고 한다.
// 필드는 클래스 내부 전역에서 사용될 수 있다 따라서 필드의 사용 범위는 클래스 스코프 라고 한다.
// 즉, 필드는 인스턴스 메소드에서 사용할 수 있다는 것이다.
public class Cat {

    String name;
    int age;

    void meow() {
        System.out.println("고양이는 야옹~~ 하고 울지요");
    }

    // 필드가 사용된 메소드
    void eat() {
        System.out.printf("우리 %s 는 맨날 먹기만 해요..", name);
        System.out.println();
    }

}
