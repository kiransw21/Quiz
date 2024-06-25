public class Program36 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Calculate the length of the resultant array
        int[] result = new int[array1.length + array2.length];

        // Copy elements from the first array into the result array
        System.arraycopy(array1, 0, result, 0, array1.length);

        // Copy elements from the second array into the result array, starting from the end of the first array
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        // Print the resultant array
        for (int i : result) {
            System.out.print(i + " ");
    }
    
}
}   q
