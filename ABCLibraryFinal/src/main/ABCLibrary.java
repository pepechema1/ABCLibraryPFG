package main;
import constant.ApplicationDesign;
import views.login.Login;
import views.login.ScreenSplash;

public class ABCLibrary {

	public static void main(String[] args) throws InterruptedException {
		ScreenSplash screenSplash;
		Login login;
		
		// Agregamos un tema a la app
		ApplicationDesign.addNewTheme();
		
		// Inicia la ventana de presentación (hilo)
		screenSplash = new ScreenSplash();
		// Espera a que finalice el hilo
		screenSplash.join();
		
		// Abre la ventana para loguearse
		login = new Login();
	}
		
}
