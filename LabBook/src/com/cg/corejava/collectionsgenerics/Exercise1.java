package com.cg.corejava.collectionsgenerics;

import java.util.*;

public class Exercise1 {
	public static List<String> getValues(HashMap<Integer, String> hm) {

		Collection<String> c = hm.values();
		List<String> l = new ArrayList<String>(c);
		Collections.sort(l);

		return l;
	}

}
