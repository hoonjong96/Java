/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2022/12/31
 * @desc
 */

// 클래스 완전 기초
// 클래스 이름은 대문자로 시작하며, 자바에서 사용하는 식별어는 사용할 수 없다!

// 클래스의 구성 요소 - 필드, 메소드, 생성자
public class Dog {
    // 필드
    String name;
    int age;

    // 메소드
    // 짖기, 물기(?) 등 -> 강아지가 하는 행동(동작들)
    void bark() {
        System.out.println("왈왈 나는 강아지랍니다");
    }
}


// Dog 클래스에서 만들어둔 이 요소를 메인 클래스나 다른 클래스에서 사용하려면 가장 먼저
// 객체를 만들어야 한다. -> 메인 클래스 참고