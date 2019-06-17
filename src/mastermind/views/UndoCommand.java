package mastermind.views;

import santaTecla.utils.Command;

public class UndoCommand extends Command {

	public UndoCommand() {
		super(MessageView.UNDO_COMMAND.getMessage());
	}

	@Override
	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
