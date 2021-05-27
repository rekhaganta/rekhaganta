package labbook4;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books book1 = new Books(1,"The Lion king", 15, "Unknown");
		Journals journal1 = new Journals(2, "Charles darwin", 5, "darwin");
		Video video1 = new Video(17,"Java Tutorial", 6, 800);
		CompactDisc cd1= new CompactDisc(6,"Iron Man", 7, 110);
		
		book1.getBookDetails();
		journal1.getJournalDetails();
		video1.getVideoDetails();
		cd1.getCDDetails();
		
	}

}


