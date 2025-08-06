import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class selenium_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ajinkya
		
//		Select drop=new Select()
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.google.com");
	        System.out.println(driver.getTitle());
	       
	}

}
