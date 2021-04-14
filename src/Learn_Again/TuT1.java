// package Learn_Again;
// multidimensional array
public class TuT1 {

	public static void main(String[] args) {
		String[][] arr = {
				{"bob","jason","grace","judas"},
				{"randy","sarah","google"},
				{"apple","android"}
		};
		for(int row =0; row<arr.length; row++){
			for(int col=0; col<arr[row].length;col++){
				System.out.println(arr[row][col]+ "\t");
			}
			System.out.println(" ");
		}
		
	}

}
