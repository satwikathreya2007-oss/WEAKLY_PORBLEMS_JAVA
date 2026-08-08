public class WarehouseInventory {

    void analyzeInventory(int[] sectionA, int[] sectionB) {

        int sumA = 0;
        int sumB = 0;

        int max = sectionA[0];
        String section = "Section A";
        int index = 0;

        // Calculate sum of Section A and find maximum
        for (int i = 0; i < sectionA.length; i++) {
            sumA = sumA + sectionA[i];

            if (sectionA[i] > max) {
                max = sectionA[i];
                section = "Section A";
                index = i;
            }
        }

        // Calculate sum of Section B and find maximum
        for (int i = 0; i < sectionB.length; i++) {
            sumB = sumB + sectionB[i];

            if (sectionB[i] > max) {
                max = sectionB[i];
                section = "Section B";
                index = i;
            }
        }

        System.out.println("Section A Total: " + sumA);
        System.out.println("Section B Total: " + sumB);

        if (sumA == sumB)
            System.out.println("Status: Balanced");
        else
            System.out.println("Status: Not Balanced");

        System.out.println("Highest Quantity: " + max);
        System.out.println("Found in " + section + ", Item " + (index + 1));
    }

    public static void main(String[] args) {

        WarehouseInventory obj = new WarehouseInventory();

        int[] sectionA = {20, 15, 30};
        int[] sectionB = {25, 10, 30};

        obj.analyzeInventory(sectionA, sectionB);
    }
}