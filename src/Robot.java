import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Robot {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		executaLinhaComando("cmd /c C:\\projetos\\eclipse\\TesteUnimed\\src\\sendKeys.bat \"Auttar\" \"\" ");
		executaAcoes();
	}
	
	public static void executaAcoes() throws AWTException {
		java.awt.Robot robot = new java.awt.Robot();
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
    }
	
	public static void executaLinhaComando(String comando) throws IOException, InterruptedException {
		Runtime rt = Runtime.getRuntime();
		Process pr = rt.exec(comando);
		
		pr.waitFor();
	}
}
