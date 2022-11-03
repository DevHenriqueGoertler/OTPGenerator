package model.util;

public class Generator {
	
	public Generator() {
		
	}
		
	public String generatePassword(int lenght) {
		String str = "abcdefghijklmnopqrstuvwxyzABCD"
	            +"EFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
		int n = str.length();
		
		String OTP = "";
		for (int i=0; i<lenght; i++) {
			OTP += (str.charAt((int) ((Math.random() * 10) % n)));
		}
		return OTP;
	}
	
}
