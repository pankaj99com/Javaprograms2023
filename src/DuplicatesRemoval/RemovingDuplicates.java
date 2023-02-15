package DuplicatesRemoval;

public class RemovingDuplicates {

	public static void main(String[] args) {
		String str="programming";
		char[] ch=str.toCharArray();
		
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<ch.length;i++) {
			boolean flag=false;
			
			for(int j=i+1;j<ch.length;j++) {
				
				if(ch[i]==ch[j]) {
					
					flag=true;
				}
			}
			
			if(flag==false) {
				sb.append(ch[i]);
				
				
			}
		}
		
		System.out.println(sb);

	}

}
