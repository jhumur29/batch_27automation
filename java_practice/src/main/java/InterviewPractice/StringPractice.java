package InterviewPractice;

//HOW DO YOU IDENTIFY UNIQUE WORD COUNTS FROM THE GIVEN STRING ?“Cat dog cat tiger rat cat dog” how do you get output as cat = 3 times, dog = 2 times, tiger =1 time, rat = 1 time.
public class StringPractice {

	public static void main(String[] args) {
		String s1 = "Cat dog cat tiger rat cat dog";
		String split[] = s1.split(" ");
		int catCount = 0;
		int dogCount = 0;
		int tigerCount = 0;
		int ratCount = 0;
		for (int i = 0; i < split.length; i++) {

			if (split[i].equalsIgnoreCase("Cat")) {
				catCount++;
			} else if (split[i].equalsIgnoreCase("Dog")) {
				dogCount++;
			} else if (split[i].equalsIgnoreCase("tiger")) {
				tigerCount++;
			} else if (split[i].equalsIgnoreCase("rat")) {
				ratCount++;
			}

		}

		System.out.println("cat= " + catCount + "times");
		System.out.println("dog= " + dogCount + "times");
		System.out.println("tiger= " + tigerCount + "times");
		System.out.println("rat= " + ratCount + "times");
	}
}
