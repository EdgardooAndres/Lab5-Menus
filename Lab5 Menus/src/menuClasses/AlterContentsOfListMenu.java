package menuClasses;

import java.util.ArrayList;

public class AlterContentsOfListMenu extends Menu {
	private static AlterContentsOfListMenu ACM = new AlterContentsOfListMenu(); 
	private AlterContentsOfListMenu() { 
		super(); 
		String title; 
		ArrayList<Option> options = new ArrayList<Option>();  
		title = "Statistics on Lists"; 
		options.add(new Option("Add a New Value to a List", new AddToListAction())); 
		options.add(new Option("Delete a Position from a List", new DeleteFromListAction())); 
		options.add(new Option("Show Content of a List", new ShowListAction())); 
		options.add(Option.EXIT); 

		super.InitializeMenu(title, options); 

	}
	
	public static AlterContentsOfListMenu getAlterContentsOfListMenu() { 
		return ACM; 
	}

}
