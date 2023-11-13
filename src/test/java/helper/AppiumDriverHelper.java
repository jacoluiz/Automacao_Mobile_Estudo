package helper;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class AppiumDriverHelper {

	private static AppiumDriverLocalService server;
	private static AppiumDriver driver;

	@BeforeAll
	public static void setUpServer() {
		server = new AppiumServiceBuilder().usingPort(4723).withArgument(() -> "--base-path", "/").build();
		server.start();
	}

	@AfterAll
	public static void tearDownServer() {
		if (server != null)
			server.stop();
		server = null;

	}

	@Before
	public void setUpDriver() {
		driver = getDriver();
	}

	@After
	public void tearDownDriver() {
		if (driver != null)
			driver.quit();
		driver = null;

	}

	public static AppiumDriver getDriver() {
		if (driver == null) {
			driver = generateDriver();
		}
		return driver;
	}

	public static DesiredCapabilities getCapabilities() {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("deviceName", "Pixel_3a_API_34_extension_level_7_x86_64");
//		capabilities.setCapability("ignoreHiddenApiPolicyError", true);
//		capabilities.setCapability("ensureWebviewsHavePages", true);
//		capabilities.setCapability("newCommandTimeout", 3600);
//		capabilities.setCapability("connectHardwareKeyboard", true);
		capabilities.setCapability("appPackage", "com.google.android.deskclock");
		capabilities.setCapability("appActivity", "com.android.deskclock.DeskClock");

		return capabilities;
	}

	public static URL getURL() throws MalformedURLException {
		return new URL("http://127.0.0.1:4723/");
	}

	public static AppiumDriver generateDriver() {

		AppiumDriver driver = null;

		try {
			driver = new AppiumDriver(getURL(), getCapabilities());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return driver;

	}

}