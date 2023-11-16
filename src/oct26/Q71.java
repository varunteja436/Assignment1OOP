package oct26;
public class Q71 {

    public static void main(String[] args) {
        int[] arr1 = {10, 65, 77, 20, 30};
        int[] arr2 = {10, 20, 30, 40, 50};

        System.out.println("arr1 contains 65 and 77: " + containsSpecifiedElements(arr1));
        System.out.println("arr2 contains 65 and 77: " + containsSpecifiedElements(arr2));
    }

    public static boolean containsSpecifiedElements(int[] arr) {
        boolean contains65 = false;
        boolean contains77 = false;

        for (int num : arr) {
            if (num == 65) {
                contains65 = true;
            }
            if (num == 77) {
                contains77 = true;
            }
        }

        return contains65 && contains77;
    }
}
