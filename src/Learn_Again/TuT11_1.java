package Learn_Again;
//Serialization and Deserialization
import java.io.Serializable;
public class TuT11_1 implements Serializable{
	
	private static final long serialVersionUID = 4758483385257162467L;
	private String gender;
	private double height;
	private String name;
	
	public TuT11_1(String gender,double height,String name){
		this.gender = gender;
		this.height = height;
		this.name = name;
					
	}
	public String toString(){
		return "TuT11_1(Gender: "+gender +" Height: "+height+" Name: "+name+")";
	}
}