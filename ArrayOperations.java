class ArrayOperations {
    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 40, 15};
        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        System.out.println("Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");        
            sum += arr[i];
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }
        double avg = (double) sum / arr.length;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}
