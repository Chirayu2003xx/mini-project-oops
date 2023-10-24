package laptops;

public interface laptopmethods {
    boolean meetsFilterCriteria(String brandFilter, double maxPrice, int minRam, int minStorage, String colorFilter);
    String toString();
}


