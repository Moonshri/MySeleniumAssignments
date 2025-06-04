package week2.day1;

public class Library {
	String addBook(String bookTitle) { // default modifier can be used in same package-different class
		System.out.println("Book added successfully");
		return bookTitle;
	}
   protected  void issueBook() {  // protected modifier can be used in same project-different package/class
    	 System.out.println("Book issued successfully");
     }
   
   public static void main(String[] args) {
	Library lib = new Library();
	lib.addBook("Book");
	lib.issueBook();
}
}

