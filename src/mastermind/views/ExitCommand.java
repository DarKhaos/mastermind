package mastermind.views;

import mastermind.controllers.PlayController;

class ExitCommand extends Command {

	protected ExitCommand(PlayController playController) {
		super(Message.EXIT_COMMAND.getMessage(), playController);
	}

	@Override
	protected void execute() {
		((PlayController) this.acceptorController).next();	
	}

	@Override
	protected boolean isActive() {
		return true;
	}

}
