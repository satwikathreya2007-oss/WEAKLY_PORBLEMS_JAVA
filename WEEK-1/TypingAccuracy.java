public class TypingAccuracy {

    void checkTypingAccuracy(String original, String typed) {

        int match = 0;
        int firstMismatch = -1;

        for (int i = 0; i < original.length(); i++) {

            if (original.charAt(i) == typed.charAt(i)) {
                match++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (match * 100.0) / original.length();

        System.out.println("Matched: " + match + "/" + original.length());
        System.out.printf("Accuracy: %.2f%%\n", accuracy);

        if (firstMismatch == -1) {
            System.out.println("No Mismatches");
        } else {
            System.out.println("First Mismatch at position " + (firstMismatch + 1)
                    + " ('" + original.charAt(firstMismatch)
                    + "' vs '" + typed.charAt(firstMismatch) + "')");
        }
    }

    public static void main(String[] args) {

        TypingAccuracy obj = new TypingAccuracy();

        obj.checkTypingAccuracy("hello world", "hello worlt");
        System.out.println();

        obj.checkTypingAccuracy("coding", "coding");
    }
}
