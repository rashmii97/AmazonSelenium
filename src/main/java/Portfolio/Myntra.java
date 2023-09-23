package Portfolio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=7095722229149425888&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007786&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Branded perfume for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//div[@class='rush-component s-featured-result-item s-expand-height']//span[@class='a-size-base-plus a-color-base a-text-normal'][normalize-space()='SKINN BY TITAN Raw Perfume for Men, 50ml']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("//input[@id='buy-now-button']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
