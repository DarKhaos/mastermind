package mastermind.views;

import mastermind.events.RedoEvent;
import mastermind.models.Mastermind;
import mastermind.views.Command;
import santaTecla.utils.Observer;

public class RedoCommand extends Command{
	
	RedoCommand(Mastermind mastermind, Observer observer) {
		super(MessageView.REDO_COMMAND.getMessage(), mastermind, observer);
	}

	@Override
	public void updateIsActive() {
		this.isActive = this.mastermind.redoable();
	}

	@Override
	public void execute() {
		this.notify(new RedoEvent());		
	}

}
