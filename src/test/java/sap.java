import org.openqa.selenium.remote.DesiredCapabilities;
import FlaNium.WinAPI.webdriver.DesktopOptions;
import FlaNium.WinAPI.webdriver.FlaNiumDriver;
import FlaNium.WinAPI.webdriver.FlaNiumDriverService;
import FlaNium.WinAPI.webdriver.FlaNiumOptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class sap {
    public static void main(String[] args) throws MalformedURLException {
        String PROCESS_NAME = "saplogon.exe";
        String ARGS = "saplogon.exe";
        Integer launchDelay = 10000;
        String APP_PATH = "C:\\Program Files (x86)\\SAP\\FrontEnd\\SAPgui\\";
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            // FirefoxOptions browserOptions = new FirefoxOptions();
            //browserOptions.setPlatformName("Windows 10");
            //browserOptions.setBrowserVersion("92");
            //Map<String, Object> cloudOptions = new HashMap<>();
            //cloudOptions.put("build", myTestBuild);
            //cloudOptions.put("name", myTestName);
            //browserOptions.setCapability("cloud:options", cloudOptions);
            //WebDriver driver = new RemoteWebDriver(new URL(cloudUrl), browserOptions);
            capabilities.setCapability("platformName", "Windows");
            capabilities.setCapability("deviceName", "Windows-PC");
            capabilities.setCapability("app", "SAP Logon 760");
            // capabilities.setCapability("app",APP_PATH + PROCESS_NAME);
            FlaNiumDriver flaNiumDriver = new FlaNiumDriver(new URL("http://127.0.0.1"), capabilities);
            flaNiumDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
            flaNiumDriver.startApp(APP_PATH+PROCESS_NAME, ARGS, launchDelay);
        } catch (IllegalArgumentException iae) {
            iae.printStackTrace();
        }
    }
}
