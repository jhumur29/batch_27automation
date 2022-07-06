package InterviewPractice;

public class ArrayFindsDuplicate {
	public void name() {
		int[] myArray= {22,55,66,22,69,74,55,58,78,69};
		for(int i=0;i<myArray.length;i++) {
			for(int j=i+1;j<myArray.length;j++) {
				if(myArray[i]==myArray[j]) {
					System.out.println("found my duplicate= "+myArray[i]);
				}
				
			}
			
		}
	}
public static void main(String[] args) {
	new ArrayFindsDuplicate().name();
}
}
