package mastermind.models;

import java.util.List;

import mastermind.types.Color;

public class SessionImplementation implements Session {

	private State state;
	
	private Game game;
	
	private Registry registry;
	
	public SessionImplementation() {
		this.state = new State();
		this.game = new Game();
		this.registry = new Registry(this.game);
	}

	public void next() {
		this.state.next();		
	}

	public void addProposedCombination(List<Color> colors) {
		this.game.addProposedCombination(colors);
		this.registry.registry();
	}

	public boolean undoable() {
		return this.registry.undoable();
	}

	public boolean redoable() {
		return this.registry.redoable();
	}

	public void undo() {
		this.registry.undo(this.game);
	}

	public void redo() {
		this.registry.redo(this.game);
	}

	public void resume() {
		this.game.clear();
		this.state.reset();	
		this.registry.reset();
	}

	public boolean isWinner() {
		return this.game.isWinner();
	}

	public boolean isLooser() {
		return this.game.isLooser();
	}

	public int getAttempts() {
		return this.game.getAttempts();
	}

	public List<Color> getColors(int i) {
		return this.game.getColors(i);
	}

	public int getBlacks(int i) {
		return this.game.getBlacks(i);
	}

	public int getWhites(int i) {
		return this.game.getWhites(i);
	}

	@Override
	public int getWidth() {
		return this.game.getWidth();
	}

	@Override
	public StateValue getValueState() {
		return this.state.getValueState();
	}
}
