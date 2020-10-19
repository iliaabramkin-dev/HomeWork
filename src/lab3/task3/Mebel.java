package lab3.task3;

public abstract class Mebel {
    private String name, type, company, material;
    private int price;

    public Mebel(String name, int price, String company, String material, String type) {
        this.name       = name;
        this.type       = type;
        this.price      = price;
        this.company    = company;
        this.material   = material;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCompany() {
        return company;
    }

    public String getMaterial() {
        return material;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price + " ";
    }
}
