package week2.day1;

public class Library {

	public String addBooks(String StoryBooks) {
		System.out.println("Book added successfully");
		return StoryBooks;

	}

	public void issueBook() {
		System.out.println("Book issued successfully");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library Book = new Library();
		String title = Book.addBooks("Children Story");
		System.out.println(title);
		
		Book.issueBook();

	}

}
