package intigerstools;

public class integerMain {

	public static void main(String[] args) {
		
		//int s [] = {2, 3, 4, 5};
		
		//integerTools it = new integerTools(s);
		//System.out.println(it.getSumArray());
		
		
		int nums1[] = {5, 6, 8,66};
		int nums2[] = {12, 23, 86,5};
		int result[];
		integerTools it = new integerTools(nums1, nums2);
		result = it.getSumTowArray();
		for(int num : result) {
			System.out.println(num);
			
			
			
			
		
		}
		
		

	}

}
