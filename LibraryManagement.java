package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {


		Library libobj = new Library();
		String name = libobj.addBooks("Automation Books");
		System.out.println(name);
		libobj.issueBook();
		

	}

}
