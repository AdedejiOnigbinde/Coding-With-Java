package Learn_Again;
//Natural Ordering

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// Implementing a Natural Order Class For Names To Be Sorted
class Human implements Comparable<Human>{
	String name;
	public Human(String name){
		this.name = name;
	}
	
	public String toString(){
		return name;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
// CompareTo Method For Comparing Names To One Another 
	public int compareTo(Human human){
		return name.compareTo(human.name);
		
	}
}

public class TuT16 {
	public static void main(String[] args) {
		List<Human> listy = new ArrayList<Human>();
		SortedSet<Human> setty = new TreeSet<Human>();
		
		AddNames(listy);
		AddNames(setty);
		
		Collections.sort(listy);
		
		SeeNames(listy);
		System.out.println("       ");
		System.out.println("Set\n");
		SeeNames(setty);
	}
	
	public static void AddNames(Collection<Human> any){
		any.add(new Human("Dale"));
		any.add(new Human("John"));
		any.add(new Human("Disney"));
		any.add(new Human("Network"));
	}
	
	public static void SeeNames(Collection<Human> any){
		for(Human names: any){
			System.out.println(names);
		}
	}
}
