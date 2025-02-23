package days15;

class Solution {
    public int solution(int[] diffs, int[] times, long limit) {
        
    	int level = 0 ;
    	int totalTime =0 ;
    	
    	for (int i = 0; i < times.length; i++) {
			if (diffs[i] <= level) totalTime += times[i];
			
			if (diffs[i] > level) {
				if (i != 1) {
					totalTime += times[i]*(diffs[i]-level)+times[i-1];
				} else totalTime += times[i]*(diffs[i]-level);
				
			}
			if (totalTime > limit) level++;
			else return level;
		} //for
		return level;
    	
    	

    	
    } // solution
} // class