
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IPValidationRegex {
 
	public static boolean checkIP(String ipAddr){

		Pattern ptn = Pattern.compile("^([01]?\\d\\d|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d|2[0-4]\\d|25[0-5])$");
		Matcher mtch = ptn.matcher(ipAddr);
		return mtch.find();
	}

	public static void main(String a[]) throws FileNotFoundException{
		String filename ="C:\\Users\\Admin\\Documents\\ip_address.txt";
		File file = new File(filename);
		Scanner input = new Scanner(file);
		List<String> list = new ArrayList<String>();

		while (input.hasNextLine()) {
		    list.add(input.nextLine());
		}
		
		for(String ip:list){
			System.out.println("Is this "+ ip +" valid? "+checkIP(ip));
		}
	}	    
}
