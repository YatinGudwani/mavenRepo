package testmaven.project;


public class School {

	Library library;
	
	public School(Library library) {
		this.library = library;
	}

	public void goTolibrary() {
		library.printWelcomeMessage();
	}
	
}
