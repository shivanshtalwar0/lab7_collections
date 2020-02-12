package lab7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
	public Main() {
		instance=new LabSeven();

		// TODO Auto-generated constructor stub
	}

	LabSeven instance;
	public static void main(String[] args) {
		Main m=new Main();
		m.runApp();
	}
	public void runApp() {
		List<Student> al;
		HashMap<String,Student> hm=new HashMap<String,Student>();
		hm.put("1",new Student(1,"ram",72,65));
		hm.put("2",new Student(2,"shyam",12,78));
		hm.put("0",new Student(0,"kaam",12,99));
		hm.put("4",new Student(5,"ram",92,75));
		hm.put("8",new Student(8,"shyam",32,73));
		hm.put("9",new Student(9,"kaam",42,80));
		al=instance.getValues(hm,Parameter.AGE,false);
		Iterator< Student> sit=al.iterator();
		while(sit.hasNext()) {
			Student s=sit.next();
			System.out.println(String.format("rollno:%s,name:%s,age:%s",s.getRollNumber(),s.getName(),s.getAge()));
		
		}
		
		Map<Character,Integer> map;
		Map<String,Double> mapsquared;
		char[] ch= {'a','a','b','b','a','c','b'};
		int []nums={25,144,45,90,3,2,1,0,980,1,0,25};
		map=instance.countCharacters(ch);
		System.out.println(map.toString());
		mapsquared=instance.getSquares(nums);
		System.out.println(mapsquared.toString());
		System.out.println(instance.getStudents(hm).toString());
		System.out.println(instance.getSecondSmallest(nums));
		for(int k:instance.getSorted(nums)) {
			System.out.println(k);
		}
		for(int k:instance.modifyArray(nums)) {
			System.out.println(k);
		}
		
		
		
		
		
		
		
	}

}
