package mastermind.views;

import mastermind.controllers.ResumeController;
import mastermind.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(Message.RESUME.getMessage()));
	}
	
}
