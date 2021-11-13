package emailProject;

public class Emailapp {

	public static void main(String[] args) {
		Email em1=new Email("SHivkumar", "Kagi");

		em1.setAlternateemail ("kagi.shiv@gmail.com");
		System.out.println("Your alternate email is  " + em1.getAlternateEmail());
		
		System.out.println(em1.showInfo());
	}

}
