
public class Person {
	String name, company, job, hobby;
	int age;
	
	public void talkAboutYourself() {
		System.out.println(
				"Hi, I'm " + name + ".\n"
				+ "I'm " + age + " years old.\n"
				+ "I work at " + company + " as a " + job + ".\n"
				+ "When I get free time, I like to " + hobby + '.');
	}
	
	public static void main(String[] args) {
		Person jacob = new Person();
		jacob.name = "Jacob";
		jacob.age = 22;
		jacob.company = "Cognizant";
		jacob.job = "Java Developer";
		jacob.hobby = "walk";
		
		jacob.talkAboutYourself();
	}

}
