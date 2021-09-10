import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

		public static void main(String[] args) {
			List<fruit> fl=new ArrayList<fruit>();
			System.out.println("Fruit List(ordered bt name)");
			fruit s1=new fruit(101,"Kiwi",1000);
			fl.add(s1);
			fruit s2=new fruit(102,"Apple",1500);
			fl.add(s2);
			fl.add(new fruit(103,"Cherry",2000));
			fl.add(new fruit(104,"Melon",1600));
			fl.add(new fruit(105,"Orange",1800));
			fl.add(new fruit(106,"Pineapple",1200));
			fl.add(new fruit(107,"Grape",1300));
			fl.add(new fruit(108,"Watermelon",1700));
			fl.add(new fruit(109,"Banana",1100));
			fl.add(new fruit(100,"Blueberry",1900));
			
			Collections.sort(fl);
			for(fruit s : fl){
				System.out.println(s.toString());
			}
			System.out.println("Fruit List (reverse ordered by name)");
			
			Collections.sort(fl, Collections.reverseOrder());
			for(int i=0; i<fl.size();i++) {
				System.out.println(fl.get(i).toString());
			}
		}
	}