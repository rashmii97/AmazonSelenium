package Portfolio;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TryCatch {
	
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("APjFqb")).sendKeys("Meaning of Rashmi", Keys.ENTER);
		
		try {
			
			driver.findElement(By.linkText("href=\"/url?sa=t&rct=j&q=&esrc=s&source=web&cd=&cad=rja&uact=8&ved=2ahUKEwjhtr_a9_SAAxXUfWwGHYH4BkoQFnoECEIQAQ&url=https%3A%2F%2Fen.wikipedia.org%2Fwiki%2FRashmi&usg=AOvVaw0Yq0O9TvXqGGCSmOOAn52j&opi=89978449\"")).click();
		}
		catch(Throwable t){
			System.out.println(t.getMessage());
		}
		finally {
			
			
			driver.findElement(By.xpath("//div[@class='kb0PBd cvP2Ce jGGQ5e']//div[@class='yuRUbf']//div//h3[@class='LC20lb MBeuO DKV0Md'][normalize-space()='Baby Name Rashmi meaning and Astrology']")).click();

		}
		
		
		
	}

}
