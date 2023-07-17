
public class Synechron {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unordered = {4, 2, 6, 9, 1};

		int min;

		for(int i = 0; i <= unordered.length; i++){
			for(int j = i+1; j <=  unordered.length-1; j++){
				
				if(unordered[i] > unordered[j]){
					min = unordered[j] ;
					unordered[j] = unordered[i];
					unordered[i] = min;
				}
			}
		} 
		for(int i : unordered) {
			System.out.println(i);
		}
	}

}
