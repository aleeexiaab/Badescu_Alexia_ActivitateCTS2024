package Problem_1;

public abstract class Medicine {
    protected String name;
    protected double price;
    protected Category category;

    public Medicine(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Medicine{name='" + name + "', price=" + price + ", category=" + category + "}";
    }
}
