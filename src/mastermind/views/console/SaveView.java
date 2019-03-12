package mastermind.views.console;

import mastermind.controllers.SaveController;
import mastermind.utils.WithConsoleView;
import mastermind.utils.YesNoDialog;
import mastermind.views.Message;

class SaveView extends WithConsoleView {

	void interact(SaveController saveController) {
		boolean save = new YesNoDialog().read(Message.SAVE.getMessage());
		String name = null;
		if (save) {
			if (saveController.hasName()) {
				saveController.save();
			} else {
				boolean exists = false;
				do {
					name = this.console.readString(Message.NAME.getMessage());
					exists = saveController.exists(name);
					if (exists) {
						this.console.writeln("El nombre propuesto ya existe");
					}
				} while (exists);
				saveController.save(name);
			}
		}
		saveController.next();
	}

}
