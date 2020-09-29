package com.exp.data;

public enum ActionType {
	
	MESSAGE_ONLY(1), MESSAGE_AND_ALTERNATE_LINKS(2), RECOMMENDATION(3), REDIRECT(4);
	
	private final int actionCode;
	
	private ActionType(int actionCode) {
		this.actionCode = actionCode;
	}
	
	public int getActionValue() {
		return this.actionCode;
	}

}
