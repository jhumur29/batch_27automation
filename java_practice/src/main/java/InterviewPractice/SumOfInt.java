package InterviewPractice;
// find sum of int num=123
public class SumOfInt {
	public void sumValue() {
		int num=123;
		int rem =0;
		int sum=0;//
		
	while (num>0) {
		rem=num % 10;//123 divided by 10 and remainder will be 3
		sum=sum+rem;//12 divided by 10 and remainder will be 2
		num=num/10;//1 divided by 10 and remainder will be 1
	}
		System.out.println(sum);
		// how to anagram of each other word
		// string s1="infosys";
		//String s2="sysofni";
	}

	public static void main(String[] args) {
		SumOfInt obj=new SumOfInt();
		obj.sumValue();
	}
}
