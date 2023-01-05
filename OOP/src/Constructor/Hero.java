package Constructor;

/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2023/01/05
 * @desc
 */
public class Hero {

    public String name;
    public int hp;

    public Hero(String n, int h) {
        name = n;
        hp = h;
    }

    public String str() {
        return String.format("Hero { name: %s, hp: %d }", name, hp);
    }
}
