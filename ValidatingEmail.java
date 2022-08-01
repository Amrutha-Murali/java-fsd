import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingEmail {
	private static final String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	   public static void main(String args[]) {
	       List<String> gmails = new ArrayList<String>();
	       gmails.add("amrutha@gmail.com");
	       gmails.add("amrutha.muralii1510@gmail.in");
	       gmails.add("shree@gmail.me.org");
	       gmails.add("Muraliamruthaabhi78@gmail.com");
	       gmails.add("amrum1510@gmail.com");
	       gmails.add("@TEMMgmadil.com");
	       gmails.add("AMRUTHA-MURALI#gmail.com");
	       gmails.add("amru%@gmail.me.org");
	       gmails.add("@amruthagmail.com");
	Pattern pattern = Pattern.compile(regex);
	       for (String value : gmails) {
	           Matcher matcher = pattern.matcher(value);
	System.out.println(value + " is " + (matcher.matches() ? "valid" : "invalid"));
	       }
	   }
	

}