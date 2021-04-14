// Up casting and Down casting
package Learn_Again;

class Music{
	protected void play(){
		System.out.println("Sound");
	}
}

class Rap extends Music{
	protected void play(){
		System.out.println("Rap Sound");
	}
	
	protected void Stop(){
		System.out.println("No Rap Sound");
	}
}

public class TuT8 {

	public static void main(String[] args) {
		Rap R1 = new Rap();
		
		//Up Casting
		Music M1 = R1;
		M1.play();
		
		// Down Casting
		Music M2 = new Rap();
		Rap R2 = (Rap)M2;
		R2.Stop();
		

	}

}
