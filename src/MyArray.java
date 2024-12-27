public class MyArray {
    public static void main(String[] args) {
        double[] arr = {10.2, 20.3, 3.55, 44.2, 88.77, 66.45, 45.36, 951.951};
        double sum = 0;
        for (double i : arr) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.print("\n "+sum);
        System.out.println("\nAverage is"+sum/arr.length);

    }

}
