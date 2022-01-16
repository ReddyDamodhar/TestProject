package assignments;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Program7 {

	public static void main(String[] args) {
		HashMap<Integer,String> m1=new HashMap<>(); 
		 m1.put(101,"Samsung"); 
		 m1.put(102,"Realme"); 
		 m1.put(103,"Oppo"); 
		 m1.put(104,"Vivo");
		 m1.put(null,"Vivo");
		 System.out.println("Hash Map Objects are : "+m1); 
		 
		 LinkedHashMap<Integer,String> m2=new LinkedHashMap<>(); 
		 m2.put(388,"Rahul"); 
		 m2.put(1,"Pooja"); 
		 m2.put(103,"Riya"); 
		 m2.put(103,"Riya");
		 m2.put(null,"Riya");
		 
		 System.out.println("LinkedHash Map Objects are : "+m2);
		 TreeMap<Integer,String> m3=new TreeMap<>(); 
		 m3.put(105,"Rahul"); 
		 m3.put(103,"Riya"); 
		 m3.put(102,"Pooja");
		 System.out.println("Tree Map Objects are : "+m3);





	}

}
