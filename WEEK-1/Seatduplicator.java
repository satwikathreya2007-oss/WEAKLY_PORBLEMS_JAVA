import java.util.*;

public class Seatduplicator {

    static void checkDuplicateSeats(int[] seatnNumber) {

        boolean found = false;

        for (int i = 0; i < seatnNumber.length; i++) {
            for (int j = i + 1; j < seatnNumber.length; j++) {

                if (seatnNumber[i] == seatnNumber[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatnNumber[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of seat numbers: ");
        int n = sc.nextInt();

        int[] seatNumbers = new int[n];

        System.out.println("Enter the seat numbers:");
        for (int i = 0; i < n; i++) {
            seatNumbers[i] = sc.nextInt();
        }

        checkDuplicateSeats(seatNumbers);
    }
}
