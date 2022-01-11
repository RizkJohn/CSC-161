package chapter_7;

public class AddressBook {

	public static void main(String[] args) {
		
		//create the required arrays
		int size = 100;
		String[] lastNames = new String[size];
		String[] firstNames = new String[size];
		String[] email = new String[size];
		String[] phoneNumber = new String[size];
		
		lastNames[0] = "Smith";
		firstNames[0] = "Jill";
		email[0] = "jsmith@abc.com";
		phoneNumber[0] = "(909) 111-2234";
		
		lastNames[1] = "Brook";
		firstNames[1] = "Jack";
		email[1] = "jbrook@abc.com";
		phoneNumber[1] = "(909) 222-2234";
		
		lastNames[2] = "Wond";
		firstNames[2] = "Peter";
		email[2] = "pwond@abc.com";
		phoneNumber[2] = "(909) 333-2234";
		
		for(int i = 0; i < size; i++) {
			if(lastNames[i] == null) {
				break;
			}
			System.out.println(lastNames[i] + ", " + firstNames[i] + " " + email[i] + " " + phoneNumber[i]);
		}

	}

}
