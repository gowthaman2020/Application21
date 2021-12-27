package loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	
		
		public class LoginPageTest {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				//WebDriver wd = new FirefoxDriver();
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWDHAMAN\\workspace\\WebDriveTest\\browser\\chromedriver.exe");
				WebDriver wd = new ChromeDriver();
				wd.manage().window().maximize();
				wd.get("https://www.google.co.in/");
			}

		}


