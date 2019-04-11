package mastermind.utils;

import java.util.ArrayList;

import mastermind.views.menus.Message;

public abstract class Menu extends WithConsoleView {

	private ArrayList<Command> commandList;

	public Menu() {
		this.commandList = new ArrayList<Command>();
	}

	public void execute() {
		ArrayList<Command> commands = new ArrayList<Command>();
		for (int i = 0; i < this.commandList.size(); i++) {
			if (this.commandList.get(i).isActive()) {
				commands.add(this.commandList.get(i));
			}
		}
		boolean error;
		int option;
		do {
			error = false;
			this.console.writeln();
			this.console.writeln(Message.OPTION.getMessage());
			for (int i = 0; i < commands.size(); i++) {
				this.console.writeln((i + 1) + ") " + commands.get(i).getTitle());
			}
			option = this.console.readInt("") - 1;
			if (!new ClosedInterval(0, commands.size()-1).includes(option)) {
				error = true;
			} 				
		} while (error);
		commands.get(option).execute();
	}

	protected void addCommand(Command command) {
		this.commandList.add(command);
	}

}
