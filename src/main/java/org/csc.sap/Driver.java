package org.csc.sap;

import java.io.File;
import java.util.Random;
import FlaNium.WinAPI.webdriver.DesktopOptions;
import FlaNium.WinAPI.webdriver.FlaNiumDriver;
import FlaNium.WinAPI.webdriver.FlaNiumDriverService;
import FlaNium.WinAPI.webdriver.FlaNiumOptions;
import org.openqa.selenium.Capabilities;
import java.io.File;
import java.net.SocketException;
import java.time.Duration;


public class Driver {
    String DRIVER_PATH = "src/main/resources/driver/FlaNium.Desktop.Driver-v2.3.2/FlaNium.Driver.exe";
    // String APP_PATH = "C:\\Program Files (x86)\\SAP\\FrontEnd\\SAPgui\\SAPgui.exe";  // "C:\\Program Files (x86)\\SAP\\NWBC70\\NWBC.exe";
    String PROCESS_NAME = "saplogon.exe";
    String DRIVER_NAME = "FlaNium.Driver.exe";
    String APP_PATH =  "C:\\Program Files (x86)\\SAP\\FrontEnd\\SAPgui\\" + PROCESS_NAME;
    // String APP_PATH =  "C:\\Windows\\System32\\notepad.exe" + PROCESS_NAME;
    // String ARGS = "/H/10.27.241.105";
    String ARGS = "";
    int driverPort = 9999;
    FlaNiumDriverService service = new FlaNiumDriverService.Builder()
            .usingDriverExecutable(new File(DRIVER_PATH).getAbsoluteFile())
            .usingPort(driverPort)
            .withTimeout(Duration.ofSeconds(30))
            .withVerbose(true)
            .withSilent(false)
            .build();
    private Boolean connectToRunningApp = true;
    Integer launchDelay = 4000;
    private String processName = "saplogon.exe"; // "notepad.exe";
    protected Integer processFindTimeOut = 9999;
    private Integer responceTimeout = 10000;
    private String appTopLevelWindow = "saplogon.exe";
    private String app = "saplogon.exe";
    private Boolean injectionActivate = true;
    private String injectionDllType;
    private String deviceName = "Windows-PC";

    DesktopOptions options = new DesktopOptions()
            .setArguments(ARGS)
            .setArguments(app)
            .setArguments(appTopLevelWindow)
            .setArguments(deviceName)
            .setApplicationPath(APP_PATH)
            .setConnectToRunningApp(connectToRunningApp)
            .setLaunchDelay(launchDelay)
            .setProcessName(processName)
            .setProcessFindTimeOut(processFindTimeOut)
            .setResponseTimeout(responceTimeout)
            .setInjectionActivate(injectionActivate)
            .setInjectionDllType(injectionDllType)
            .setApplicationPath(String.valueOf(new File(APP_PATH)));
        FlaNiumDriver driver = new FlaNiumDriver(service, options);

    // WebDriverRunner.setWebDriver(driver);
}
