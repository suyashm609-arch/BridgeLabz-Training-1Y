import java.util.Scanner;

class ArrayReversing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int Size = sc.nextInt();

        int[] arr = new int[Size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < Size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reversed array:");
        for (int i = Size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
