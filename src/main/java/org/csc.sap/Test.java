package org.csc.sap;

import FlaNium.WinAPI.webdriver.FlaNiumDriverService;

import java.io.File;
import java.time.Duration;

public class Test {
    String DRIVER_PATH = "src/main/resources/driver/FlaNium.Desktop.Driver/FlaNium.Driver.exe";
    String LOG_PATH = "logs/log.txt";

    int driverPort = 7885;

    FlaNiumDriverService service = new FlaNiumDriverService.Builder()
            .usingDriverExecutable(new File(DRIVER_PATH).getAbsoluteFile())
            .usingPort(driverPort)
            .withVerbose(true)
            .withSilent(false)
            .withTimeout(Duration.ofSeconds(20))
            .withLogFile(new File(LOG_PATH).getAbsoluteFile())
            .build();
}
