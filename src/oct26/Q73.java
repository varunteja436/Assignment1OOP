package oct26;

import java.util.Arrays;
import java.util.HashSet;

public class Q73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {20, 20, 30, 40, 50, 50, 50};
		int longestLength = longestConsecutiveSequenceLength(array);
		System.out.println("LENGTH OF THE longest Consecutive Sequence: " +longestLength);
	}
	private static int longestConsecutiveSequenceLength(int[]array) {
		if (array.length == 0) {
			return 0;
		}
       HashSet< Integer > set = new HashSet <> ();
       for(int num : array) {
    	   set.add(num);
       }
       int longestStreak = 0;
       for(int num : set) {
    	   if(!set.contains(num - 1)) {
    		   int currentnum = num;
    		   int currentStreak = 1;
    		   while(set.contains(currentnum +1)) {
    			   currentnum++;
    			   currentStreak++;
    		   }
    		   longestStreak = Math.max(longestStreak,currentStreak);
    		   
    		   }
    	   }
       return longestStreak;
       }
        
        
	
		

	

}
