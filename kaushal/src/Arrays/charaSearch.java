package Arrays;

public class charaSearch {
	public static void main(String[] args ) {
		char[] letters = {'c', 'f', 'g'};
		char target = 'f';
		charaSearch h = new charaSearch();
		h.charaSearch(letters , target);
		System.out.print(h.charaSearch(letters , target));
	}
	public  char charaSearch(char [] letters , char target) {
		int start = 0;
		int end = letters.length -1;
		while (start <= end) {
			int mid = start + (end - start )/2;
			if (target < letters[mid]) {
				end = mid - 1;				
			}else {
				start = mid +1;
			}
		}
		return letters[start % letters.length];
	}
}
