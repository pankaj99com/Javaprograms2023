package DuplicatesRemoval;

public class RemovingDuplicatesUsingIndexOf {

	public static void main(String[] args) {
		String str="programming";
		
		System.out.println(str.indexOf('a'));
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			int index= str.indexOf(ch,i+1);
			
			if(index==-1) {
				
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}

}
