package ust.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> el =new ArrayList( Arrays.asList("d1","f4","a3","'b7","b2","x4","l2","f3","f1","a1","c2","b2","a4","b","a1"));
		List<String>newEl = el.stream().filter((s) -> s.startsWith("a")).collect(Collectors.toList());
		System.out.println(newEl);
		HashSet<String> hset = new HashSet<>(newEl);
		 System.out.println(" Unique Values: "
                 + hset);
		 Map<String,String> map= new HashMap<>();
		 hset.forEach((x)->
		 map.put((x.substring(1)),(x.substring(0,1)))
				 );
		 System.out.println(map);
		
	}

}
