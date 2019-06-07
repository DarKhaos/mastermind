package mastermind.views;

import mastermind.controllers.ResumeController;
import mastermind.views.menus.MessageView;
import santaTecla.utils.YesNoDialog;

class ResumeView {

	void interact(ResumeController resumeController) {
		resumeController.resume(new YesNoDialog().read(MessageView.RESUME.getMessage()));
	}
	
}
