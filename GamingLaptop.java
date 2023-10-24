package laptops;

public class GamingLaptop extends Laptop {
    private String gpu;

    public GamingLaptop(String brand, double price, int ram, int storage, String color, String gpu) {
        super(brand, price, ram, storage, color);
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return super.toString() + ", GPU: " + gpu;
    }
}
