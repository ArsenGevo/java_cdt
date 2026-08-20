package cdt;

public class IntToString {
	
	public static void main(String[] args) {
		
		convert();
		
	}

	public static void convert() {
		
		//int to string
		int benId = 1234;
		String id = String.valueOf(benId);
		
		//string to int zurück
		int benId2 = Integer.parseInt(id);
		
		System.out.println(benId);
		System.out.println(id);
		System.out.println(benId2);
		

	}
	
}

