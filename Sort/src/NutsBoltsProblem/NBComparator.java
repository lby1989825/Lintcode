package NutsBoltsProblem;

import java.util.Comparator;

public class NBComparator implements Comparator<String> {

	@Override
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		NBCompare nb = new NBCompare();
		return nb.cmp(a, b);
	}
	

}
