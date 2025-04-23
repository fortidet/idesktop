package org.csc.sap;

import FlaNium.WinAPI.DesktopElement;
import FlaNium.WinAPI.FlaNium;
import FlaNium.WinAPI.webdriver.DesktopOptions;
import FlaNium.WinAPI.actions.KeyboardActions.*;
import FlaNium.WinAPI.webdriver.FlaNiumDriver;
import org.csc.sap.Driver.*;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.function.ThrowingSupplier;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.SocketException;
import java.time.Duration;
import java.util.function.Function;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Main extends Driver {

    @Test
    public void FluentWait0() throws IOException, SocketException {
        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locator = wait.until(driver ->
                (DesktopElement) driver.findElement(By.xpath("/Window[2]/Pane/Pane/Pane[2]/Pane/List/ListItem[2]")));
        locator.click();
        locator.click();
    }
    @Test
    public void FluentWait1() throws IOException, SocketException {
        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        // locator.sendKeys("Test text");
        DesktopElement locatorAutoId = wait.until(driver ->
                (DesktopElement) driver.findElement(By.xpath("//*[(@AutomationId = '136612104')]")));
        locatorAutoId.click();
    }
//        driver.findElement(By.xpath("//*[(@AutomationId = '136612104')]"));
@Test
public void FluentWait2() throws IOException, SocketException {

    Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
            .withTimeout(Duration.ofSeconds(30))
            .pollingEvery(Duration.ofSeconds(5))
            .ignoring(NoSuchElementException.class);
    DesktopElement locatorNameXpath = wait.until(driver ->
            (DesktopElement) driver.findElement(By.xpath("//*[(@Name = '')]")));
    locatorNameXpath.click();
//        driver.findElement(By.xpath("//*[(@Name = '')]"));
}
    @Test
    public void FluentWait3() throws IOException, SocketException {

        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locatorClassNameXpath = wait.until(driver ->
                (DesktopElement) driver.findElement(By.xpath("//*[(@ClassName = '')]")));
        locatorClassNameXpath.click();
//        driver.findElement(By.xpath("//*[(@ClassName = '')]"));
    }
    @Test
    public void FluentWait4() throws IOException, SocketException {

        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locatorHelpText = wait.until(driver ->
                (DesktopElement) driver.findElement(By.xpath("//*[(@ClassName = '')]")));
        locatorHelpText.click();
//        driver.findElement(By.xpath("//*[(@HelpText = '')]"));
    }
    @Test
    public void FluentWait5() throws IOException, SocketException {

        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locatorControlType = wait.until(driver ->
                (DesktopElement) driver.findElement(By.xpath("//*[(@ControlType = '')]")));
        locatorControlType.click();
//        driver.findElement(By.xpath("//*[(@ControlType = '')]"));
    }
    @Test
    public void FluentWait6() throws IOException, SocketException {

        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locatorName = wait.until(driver ->
                (DesktopElement) driver.findElement(By.name("Button2")));
        locatorName.click();
//        driver.findElement(By.name("Checkbox1"));
    }
    @Test
    public void FluentWait7() throws IOException, SocketException {

        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locatorId = wait.until(driver ->
                (DesktopElement) driver.findElement(By.id("SAP Logon 760")));
        locatorId.click();
//        driver.findElement(By.id("Form1"));
    }
    @Test
    public void FluentWait8() throws IOException, SocketException {

        Wait<FlaNiumDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        DesktopElement locatorClassName = wait.until(driver ->
                (DesktopElement) driver.findElement(By.className("MenuItem")));
        locatorClassName.click();
//        driver.findElement(By.className("MenuItem"));
}


@BeforeEach
@AfterEach
protected void closeDriver() throws IOException {//        driver.killAllProcessesByName("saplogon.exe");
        driver.killAllProcessesByName(PROCESS_NAME);
        driver.killAllProcessesByName(DRIVER_NAME);
    }
}