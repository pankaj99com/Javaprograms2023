package StringPrograms;

public class StringPractice {
	
	public static void main(String[] args) {
		
		
		String str="India scored 100 runs in 10 overs";
		String ns="";
		for(int i=0;i<str.length();i++) {
			
			if(!Character.isDigit(str.charAt(i))) {
				ns=ns+str.charAt(i);
			}
		}
		
		System.out.println(ns);
	}

}
