package Learn_Again;
// Using Static and Final Variables and Methods
public class IdNumber {
	public static void main(String args[]){
		new man();
		new man();
		new man();
		new man();
		new man();
		new man();
		new man();
		new man();
		new man();
		
	}
}

class man {
	public static int id =0;
	
	public man(){
		id++;
		System.out.println("Your ID id : " + id);
	}
}