package screen;

import org.openqa.selenium.support.PageFactory;

import helper.AppiumDriverHelper;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MasterScreenFactory {

//	public static HomeScreen getHomeScreen() {
//		HomeScreen homeScreen = new HomeScreen();
//		PageFactory.initElements(new AppiumFieldDecorator(AppiumDriverHelper.getDriver()), homeScreen);
//		
//		return homeScreen;
//	}

	public static <T> T getPage(Class<T> cls) {
		T page;

		try {
			page = cls.newInstance();
			PageFactory.initElements(new AppiumFieldDecorator(AppiumDriverHelper.getDriver()), page);

		} catch (Exception e) {
			System.out.println(e);
			throw new RuntimeException(e);
		}

		return page;
	}

}
