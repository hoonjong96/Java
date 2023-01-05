/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2023/01/05
 * @desc
 */

// Square Class
public class Square {
    int length;
    int area;

    void area() {
        area = length * length;
    }

    void printArea() {
        System.out.printf("한 변의 길이가 %d인 정사각형의 넓이: %d", length, area);
    }

}
