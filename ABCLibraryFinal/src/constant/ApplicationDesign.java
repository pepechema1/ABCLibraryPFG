package constant;

import javax.swing.UIManager;

public class ApplicationDesign {
	
	public ApplicationDesign() {}

	public static void addNewTheme() {
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
