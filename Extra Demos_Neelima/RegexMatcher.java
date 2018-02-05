import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
	public static void main(String args[]) {
		String line = "This order was placed for QT3000! o54KL";
		String pattern = "(^T)(.*)(\\d+)";

		Pattern r = Pattern.compile(pattern);
	//	Pattern p = Pattern.compile("(^T)(.*)(\\d+)");
		Matcher m = r.matcher(line);
		
		if (m.find()) {
			System.out.println("Group 0: " + m.group(0)); // whole pattern
			System.out.println("Group 1: " + m.group(1));
			System.out.println("Group 2: " + m.group(2));
			System.out.println("Group 3: " + m.group(3));
		} else {
			System.err.println("NO MATCH"); 
			}
	}
}