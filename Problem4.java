import java.util.*;

class Asset {
    String name;
    double returnRate;
    double volatility;

    Asset(String name, double r, double v) {
        this.name = name;
        this.returnRate = r;
        this.volatility = v;
    }
}

public class Problem4 {

    static void mergeSort(List<Asset> list) {
        list.sort(Comparator.comparingDouble(a -> a.returnRate));
    }

    static void quickSort(List<Asset> list) {
        list.sort((a, b) -> {
            if (b.returnRate != a.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            return Double.compare(a.volatility, b.volatility);
        });
    }

    public static void main(String[] args) {
        List<Asset> list = new ArrayList<>();
        list.add(new Asset("AAPL", 12, 5));
        list.add(new Asset("TSLA", 8, 7));
        list.add(new Asset("GOOG", 15, 4));

        mergeSort(list);
        System.out.println("Merge done");

        quickSort(list);
        System.out.println("Quick done");
    }
}