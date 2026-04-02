import java.util.*;

class Asset {
    String name;
    double returnRate, volatility;

    Asset(String n, double r, double v) {
        name = n; returnRate = r; volatility = v;
    }

    public String toString() {
        return name + ":" + returnRate;
    }
}

public class Problem4 {
    public static void main(String[] args) {
        Asset[] arr = {
                new Asset("AAPL",12,5),
                new Asset("TSLA",8,7),
                new Asset("GOOG",15,4)
        };

        Arrays.sort(arr, Comparator.comparingDouble(a -> a.returnRate));
        System.out.println("Merge Style (asc): " + Arrays.toString(arr));

        Arrays.sort(arr, (a,b) -> {
            if (b.returnRate != a.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            return Double.compare(a.volatility, b.volatility);
        });

        System.out.println("Quick Style (desc): " + Arrays.toString(arr));
    }
}