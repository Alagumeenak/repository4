package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class MouseTest {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		Runtime.getRuntime().exec("excel");
		Thread.sleep(2000);
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_8);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(2000);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_A);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
