package constant;

import java.awt.Color;

public enum ApplicationColor {
	BACKGROUND_COLOR(Color.decode("#A80909")),
	TEXT_COLOR(Color.decode("#FFFFFF")),
	ERROR_MESSAGE_COLOR(Color.decode("#030101")),
	BUTTON_BACKGROUND_COLOR(Color.decode("#FFFFFF")),
	BUTTON_TEXT_COLOR(Color.decode("#000000"));
	
	private Color color;
	
	private ApplicationColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
}
