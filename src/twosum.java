import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twosum {
	public static int[] solve(int[] nums, int target) {
		List<Integer> rs = new ArrayList<>(); 
//		Map<Integer, Integer> numberMapping = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			if (numberMapping.get(nums[i]) == null)
//				numberMapping.put(nums[i], 1);
//			else
//				numberMapping.put(nums[i], numberMapping.get(nums[i]) + 1);
//		}
//
//		for(int key : numberMapping.keySet()) {
//			System.out.println(key);
//		}
//		System.out.println(numberMapping);
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target)
				{
					rs.add(i);
					rs.add(j);
				}
			}
		}
		int[] res = new int[rs.size()];
		for(int i = 0; i < rs.size(); i++) res[i] = rs.get(i);
		return res;
	}

	public static void main(String[] args) {
		int[] nums = { 7, 2, 3, 6, 7, 7, 7 };
		int target = 9;
		int[] res = solve(nums, target);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(res[i]+"  ");
		}
	}
}
