package Learn_Again;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

//Queue 
public class TuT17 {

	public static void main(String []args){
		Queue<Integer> line = new ArrayBlockingQueue<Integer>(10);
		TuT17 test = new TuT17();
		test.offering(line);
		test.removing(line);
		//test.peaking(line);
		//System.out.println(line.element());
	}
	//Adding To The Queue Using Add Method
	public void add(Queue<Integer> line2){
		for(int i=1;i<=10;i++ ){
			line2.add(i);
		}
		System.out.println(line2);
	}
	//Adding To Queue Using Offer Method
	public void offering(Queue<Integer> line3){
		for(int j=1;j<=11;j++){
			Random rand = new Random();
			int d = rand.nextInt(100);
			line3.offer(d);
		}
		System.out.println(line3);
	}
	// Printing Out The Top Value In The Queue
	public void peaking(Queue<Integer> line4){
		System.out.println("The peak of the Queue "+line4.peek());
	}
	// Removing From The Queue
	public void removing(Queue<Integer> line5){
		line5.remove();
		System.out.println("Removed An Item "+line5);
	}
}
