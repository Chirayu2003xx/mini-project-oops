import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface laptopmethods{
    abstract boolean meetsFilterCriteria(String brandFilter, double maxPrice, int minRam, int minStorage, String colorFilter);
    abstract String toString();
}

class Laptop implements laptopmethods {
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

class GamingLaptop extends Laptop {
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

class LaptopShop {
    private List<Laptop> laptops = new ArrayList<>();

    public void addLaptop(Laptop laptop) {
        laptops.add(laptop);
    }

    public List<Laptop> filterLaptops(String brandFilter, double maxPrice, int minRam, int minStorage, String colorFilter) {
        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.meetsFilterCriteria(brandFilter, maxPrice, minRam, minStorage, colorFilter)) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }
}

public class oopsjava2 {
    public static void main(String[] args) {
        LaptopShop shop = new LaptopShop();

        shop.addLaptop(new Laptop("Dell", 80000, 8, 256, "Silver"));
        shop.addLaptop(new Laptop("HP", 75000, 12, 512, "Black"));
        shop.addLaptop(new GamingLaptop("Acer",90000 , 16, 512, "Red", "NVIDIA RTX 3080"));
        shop.addLaptop(new GamingLaptop("Asus", 160000, 32, 1024, "Black", "NVIDIA RTX 3090"));
        shop.addLaptop(new Laptop("HP", 85000, 12, 512, "Black"));
        shop.addLaptop(new Laptop("Dell", 75000, 8, 256, "Silver"));
        shop.addLaptop(new Laptop("HP", 70000, 12, 512, "Black"));
        shop.addLaptop(new Laptop("Lenovo", 55000, 16, 256, "Gray"));
        shop.addLaptop(new Laptop("Asus", 50000, 16, 512, "Blue"));
        shop.addLaptop(new Laptop("Apple", 70000, 16, 512, "Silver"));
        shop.addLaptop(new Laptop("MSI", 30000, 8, 512, "Black"));
        shop.addLaptop(new Laptop("Asus", 35000, 8,128, "Silver"));
        shop.addLaptop(new Laptop("Acer", 40000, 16, 512, "black"));
        shop.addLaptop(new Laptop("Samsung", 80000, 16, 512, "Blue"));
        shop.addLaptop(new Laptop("LG", 45000, 16, 512, "black"));
        shop.addLaptop(new GamingLaptop("HP", 60000, 16, 512, "Black", "NVIDIA RTX 4000"));
        shop.addLaptop(new GamingLaptop("Asus", 70000, 32, 1024, "Black", "NVIDIA RTX 2134"));
        shop.addLaptop(new GamingLaptop("MSI", 120000, 32, 1024, "Black", "NVIDIA RTX 4500"));
        shop.addLaptop(new GamingLaptop("Asus", 1400, 32, 1024, "Black", "NVIDIA RTX 3090"));
        Scanner scanner = null;
try {
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Laptop Shop Filter");
        System.out.print("Enter brand filter (or press Enter to skip): ");
        String brandFilter = sc.nextLine();
        System.out.print("Enter maximum price: ");
        double maxPrice = sc.nextDouble();
        System.out.print("Enter minimum RAM: ");
        int minRam = sc.nextInt();
     sc.nextLine();  // Consume the newline character
        System.out.print("Enter minimum storage: ");
        int minStorage = sc.nextInt();
     sc.nextLine();  // Consume the newline character
        System.out.print("Enter color filter (or press Enter to skip): ");
        String colorFilter = sc.nextLine();

        List<Laptop> filteredLaptops = shop.filterLaptops(brandFilter, maxPrice, minRam, minStorage, colorFilter);

        System.out.println("\nMatching Laptops:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop.toString());
        }
    }
}
finally {
    if(scanner!=null)
        scanner.close();
}




       

    }
}