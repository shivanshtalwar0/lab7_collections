package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;

public class LabSeven {
	public int[] modifyArray(int [] a) {
		
		HashSet<Integer> set=new HashSet<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:a) {
			set.add(i);
		}
		set.forEach((v)->{
			list.add(v);
		});
		list.sort(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				if(o1>o2)
					return 1;
				else if(o1<o2)
					return -1;
				else
					return 0;
			};
		});

		Iterator<Integer> it=list.iterator();
		int index=0;
		while(it.hasNext()) {
			a[index]=it.next();
			++index;
		}
		
		return a;
		
	}
	
	public int[] getSorted(int[] n){
		int i=0;
		for(int a:n) {
			n[i]=Integer.parseInt(new StringBuilder(String.valueOf(a)).reverse().toString());
			i++;
		}
		Arrays.sort(n);
		return n;
		
	}
	
	public List<Voter> votersList(HashMap<String,Voter> map){
		Set<Entry<String,Voter>> entries = map.entrySet();
		Iterator<Entry<String, Voter>> i = entries.iterator();
		while (i.hasNext()) {
			Entry<String, Voter> entry = i.next();
			String key = entry.getKey();
			Voter value = entry.getValue();
			
		
		}
		
		
		return null;
	}
	
	public int getSecondSmallest(int [] a) {
		ArrayList<Integer>b=new ArrayList<Integer>();
		for(int i:a) {
			b.add(i);
		}
		b.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				if(o1<o2)
					return 1;
				else if(o1>o2)
					return -1;
				else
					return 0;
			}
		});
		return b.get(b.size()-2);
		
	}

	public HashMap<String, Student> getStudents(HashMap<String, Student> map) {
		Set<Entry<String, Student>> entries = map.entrySet();
		Iterator<Entry<String, Student>> i = entries.iterator();
		while (i.hasNext()) {
			Entry<String, Student> entry = i.next();
			String key = entry.getKey();
			Student value = entry.getValue();
			if (value.getMarks() >= 70 && value.getMarks() < 80) {
				value.setMedalType("Bronze");
				entry.setValue(value);
			} else if (value.getMarks() >= 80 && value.getMarks() < 90) {
				value.setMedalType("Silver");
				entry.setValue(value);
			} else if (value.getMarks() >= 90) {
				value.setMedalType("Gold");
				entry.setValue(value);
			} else {
				value.setMedalType("Not Qualified");
				entry.setValue(value);
			}

		}
		return map;

	}

	public List<Student> getValues(HashMap<String, Student> map, Parameter parameter, boolean reverse) {
		ArrayList<Student> list = new ArrayList<Student>();
		map.forEach((k, v) -> {
			list.add(v);
		});

		list.sort(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				Student s1 = o1;
				Student s2 =o2;
				int retvalue = 1;
				if (reverse) {
					retvalue = -1;
				}
				if (parameter.equals(Parameter.AGE)) {
					if (s1.getAge() < s2.getAge())
						return -retvalue;
					else if (s1.getAge() > s2.getAge())
						return retvalue;
					else
						return 0;
				} else if (parameter.equals(Parameter.ROLLNUMBER)) {
					if (s1.getRollNumber() < s2.getRollNumber())
						return -retvalue;
					else if (s1.getRollNumber() > s2.getRollNumber())
						return retvalue;
					else
						return 0;
				} else if (parameter.equals(Parameter.NAME)) {
					return s1.getName().compareTo(s2.getName());
				}

				return 0;
			}

		});
		return list;

	}

	Map<Character, Integer> countCharacters(char[] arr) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		return map;
	}

	Map<String, Double> getSquares(int[] i) {
		Map<String, Double> map = new HashMap<String, Double>();
		for (int v : i) {
			map.put(String.format("%s", v), Math.sqrt(v));
		}
		return map;
	}

}
