import java.util.Scanner;

public class CompareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Citirea dimensiunilor tablourilor
        System.out.print("Introduceti dimensiunea tabloului a (n): ");
        int m = scanner.nextInt();

        System.out.print("Introduceti dimensiunea tabloului b (n): ");
        int n = scanner.nextInt();

        // Declarația și inițializarea tablourilor a și b
        int[] a = new int[m];
        int[] b = new int[n];

        // Citirea elementelor tabloului a
        System.out.println("Introduceti elementele tabloului a:");
        for (int i = 0; i < m; i++) {
            System.out.print("a[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        // Citirea elementelor tabloului b
        System.out.println("Introduceti elementele tabloului b:");
        for (int i = 0; i < n; i++) {
            System.out.print("b[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        // Determinarea câtor elemente din a sunt strict mai mici decât toate elementele din b
        int count = 0;
        for (int i = 0; i < m; i++) {
            boolean isStrictlySmaller = true;
            for (int j = 0; j < n; j++) {
                if (a[i] >= b[j]) {
                    isStrictlySmaller = false;
                    break;
                }
            }
            if (isStrictlySmaller) {
                count++;
            }
        }

        // Afișarea rezultatului
        System.out.println("Numarul de elemente din a strict mai mici decat toate elementele din b: " + count);

        // Închiderea scannerului
        scanner.close();
    }
}
