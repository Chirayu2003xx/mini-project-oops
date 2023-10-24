package laptops;
import java.util.ArrayList;
import java.util.List;

public class LaptopShop {
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
