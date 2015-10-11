package LargestNumber;

import java.util.Comparator;

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		if(a.length() == b.length()) return b.compareTo(a);
		String ab = a + b, ba = b + a;
		return ba.compareTo(ab);
	}

}
