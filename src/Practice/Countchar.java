package Practice;

public class Countchar {

	public static void main(String arg[]) {
		String str = "hhaahhhr";
		char[] c = str.toCharArray();
		int count = 0;

		for (int i = 0; i < c.length; i++) {
			// System.out.println(c[i]+" "+i);
			boolean flag = true;
			for (int k = 0; k < i; k++) {
				if (c[i] == (str.charAt(k)))
					flag = false;
			}
			if (flag) {
				for (int j = 0; j < str.length(); j++) {
					if (c[i] == str.charAt(j))
						count = count + 1;
				}
				System.out.println(c[i] + " " + " " + (count));
				count = 0;
							}//if
		}//for outer
	}//Main
}//class
