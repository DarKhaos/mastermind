package mastermind.views.graphics;

import javax.swing.JLabel;
import mastermind.views.Color;

@SuppressWarnings("serial")
class ProposedCombinationView extends JLabel {

	static final int ERROR_CODE = -1;

	ProposedCombinationView(int[] codes) {
		String initials = "";
		for (int code : codes) {
			initials += Color.getInstance(code).getInitial();
		}
		this.setText(initials);
	}

	ProposedCombinationView() {
	}

	int[] read(String characters) {
		int[] codes = new int[characters.length()];
		for (int i = 0; i < characters.length(); i++) {
			Color colorView = Color.getInstance(characters.charAt(i));
			if (colorView == null) {
				codes[i] = ProposedCombinationView.ERROR_CODE;
			} else {
				codes[i] = colorView.ordinal();
			}
		}
		return codes;
	}

}
