package cdt;

public class IntToStringUeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = " 25 ";
		
		int inputInt = Integer.parseInt(input.trim());
		
		inputInt = inputInt + 10;
		
		String erg = String.valueOf(inputInt);
		
		System.out.println(erg);
	}

}
