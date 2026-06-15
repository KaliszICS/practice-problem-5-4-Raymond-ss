public class PracticeProblem {

	public static void main(String args[]) {

	}

		public static void stringSwap(String[] arr, int index1, int index2) {
		String temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}

	public static void reverse(int[] arr) {
    for (int i = 0; i < arr.length / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
}

	public static String[] toWordArray(String str){
		
		if(str.trim() == ""){
			return new String[0];
		}

		String[] parts = str.trim().split(" ");

		int count = 0;

		for (int i =0; i < parts.length; i++) {
			if (!parts[i].equals("")) {
				count++;
			}
		}
		String[] result = new String[count];

		int count2 = 0;
		
		for (int i =0; i < parts.length; i++) {
			if (!parts[i].equals("")){
			result[count2] = parts[i];
			count2++;
			}
		}
		return result;

	}
}
