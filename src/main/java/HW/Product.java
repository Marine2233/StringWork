package HW;

public class Product {
    private int count;
    private String name;
    private int price;

    public Product(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ""  + price + " "+count;
    }

    public int getCount() {
        return count;
    }
}
