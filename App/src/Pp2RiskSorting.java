class Client {
    String name;
    int riskScore;
    double balance;

    Client(String n, int r, double b) {
        name = n; riskScore = r; balance = b;
    }

    public String toString() {
        return name + ":" + riskScore;
    }
}

public class Pp2RiskSorting {

    static void bubbleSort(Client[] arr) {
        int swaps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].riskScore > arr[j + 1].riskScore) {
                    Client temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Bubble: " + Arrays.toString(arr));
        System.out.println("Swaps: " + swaps);
    }

    static void insertionSortDesc(Client[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Client key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].riskScore < key.riskScore) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Insertion Desc: " + Arrays.toString(arr));
    }

    static void topClients(Client[] arr) {
        System.out.println("Top Risks:");
        for (int i = 0; i < Math.min(10, arr.length); i++) {
            System.out.println(arr[i]);
        }
    }
}