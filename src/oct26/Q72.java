package oct26;

import java.util.Arrays;

public class Q72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,3,5,3,6,8,8,2,3};
        System.out.println(Arrays.toString(arr));

        int i = 0;
        int j = 0;
        int count = 0;
        int k = 0;
        int pk = 0;

        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    if (i != j) {
                        pk++;
                        break;
                    }

                }
            }


        }
        count = pk;
        System.out.println(count);
        System.out.println("New length of the array after removing duplicate items is: " + (arr.length-count));
	}

}
