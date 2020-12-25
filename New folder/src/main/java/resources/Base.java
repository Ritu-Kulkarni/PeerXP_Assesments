package resources;




	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class Base {
		public WebDriver driver;
		public Properties prop;

		@Test
		public WebDriver intialiseDriver() throws IOException {

			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Rajni\\eclipse-workspace\\Peers\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browsername = prop.getProperty("browser");
			if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Rajni\\Desktop\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();

			} else {

				System.out.println("o");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;

		}
	}



