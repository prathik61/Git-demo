import org.openqa.selenium.firefox.FirefoxDriver;

public class ppr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\prathrao\\Desktop\\geckodriver.exe");
	FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://my.oracle.com");
	}

}
