package Constructor;

/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2023/01/06
 * @desc
 */
// Constructor 복습해보자
// 스포츠 클래스를 만들어보자!

class RecapConstructor {
    // 스포츠 클래스 필드
    public String name;
    public String item;

    public RecapConstructor(String n, String i) {
        name = n;
        item = i;
    }

    public String str() {
        return String.format("name: %s, item: %s", name, item);
    }
}

class OutputData {
    public static void main(String[] args) {
          RecapConstructor soccer = new RecapConstructor("축구", "내 장비는 멋찐풋살화");
          RecapConstructor bassball = new RecapConstructor("야구", "내 장비는 멋찐야구배트");

        System.out.println(soccer.str());
        System.out.println(bassball.str());
    }
}


