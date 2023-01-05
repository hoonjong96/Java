package Constructor;

/**
 * @author jongdroid
 * @email qkr7627@gmail.com
 * @created 2023/01/05
 * @desc
 */
public class Goroke {
    public String name;
    public int price;

    public Goroke(String n, int p) {
        name = n;
        price = p;
    }

    public String str() {
        return String.format("Goroke { name: %s, price: %d원 }", name, price);
    }
}

