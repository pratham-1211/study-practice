package webelementhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class RobotClass {
	
	public void fileUploadByRobot(File file) throws AWTException{{
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        Robot robot = new Robot();
        if (System.getProperty("os.name").toLowerCase().contains("WINDOWS".toLowerCase())) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

        } else {
            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.delay(1000);

            //Open Goto window

            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_G);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_G);

            //Paste the clipboard value

            robot.keyPress(KeyEvent.VK_META);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_META);
            robot.keyRelease(KeyEvent.VK_V);

            //Press Enter key to close the Goto window and Upload window

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(1000);

        }

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

}

}
