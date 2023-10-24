package laptops;

public class Laptop implements laptopmethods {
    private String brand;
    private double price;
    private int ram;
    private int storage;
    private String color;

    public Laptop(String brand, double price, int ram, int storage, String color) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
    }

    public boolean meetsFilterCriteria(String brandFilter, double maxPrice, int minRam, int minStorage, String colorFilter) {
        return (brandFilter.isEmpty() || brand.equalsIgnoreCase(brandFilter)) &&
               price <= maxPrice &&
               ram >= minRam &&
               storage >= minStorage &&
               (colorFilter.isEmpty() || color.equalsIgnoreCase(colorFilter));
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Price: " + price+"rs" + ", RAM: " + ram + "GB, Storage: " + storage + "GB, Color: " + color;
    }
}
