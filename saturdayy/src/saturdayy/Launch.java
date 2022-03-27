package saturdayy;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Ramakrishna";
		System.out.println(s1);
		String s2 = s1.concat("Paramahamsa");
		System.out.println(s2);
		String s3 = s1.concat(" Paramahamsa");
		System.out.println(s3);
	}

}


/* immutable string cannot be change because it is unchangeable. If we faced it to change the 
brand new object will created in memory & it was collected by garbage collector.*/