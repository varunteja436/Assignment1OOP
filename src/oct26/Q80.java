package oct26;



public class Q80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
        int[] array = {-3,-7,-1,12,23,78,-78};

        System.out.println("Original Array: ");
        printArray(array);

        separatePositiveNegative(array);

        System.out.println("\nArray after Separation: ");
        printArray(array);
    }

    public static void separatePositiveNegative(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
           
            while (arr[left] >= 0 && left <= right) {
                left++;
            }

          
            while (arr[right] < 0 && left <= right) {
                right--;
            }

            if (left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}