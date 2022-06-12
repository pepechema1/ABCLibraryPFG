package constant;

import javax.swing.ImageIcon;

public enum ApplicationIconImage {
	ICON(new ImageIcon(".\\res\\icon.png"));
	
	private ImageIcon icon;
	
	private ApplicationIconImage(ImageIcon icon) {
		this.icon = icon;
	}
	
	public ImageIcon getIcon() {
		return icon;
	}

}
