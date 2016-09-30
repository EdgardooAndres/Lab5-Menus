package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object arg) {
		// TODO Auto-generated method stub
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting a list from the system:\n"); 
		String listName = io.getInput("\nEnter name of list to delete: "); 
		dm.deleteList(listName); 
	}

}
