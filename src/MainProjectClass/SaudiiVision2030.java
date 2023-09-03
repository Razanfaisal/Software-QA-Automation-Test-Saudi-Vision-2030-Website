package MainProjectClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
public class SaudiiVision2030 extends BaseClass {
	
	 @Test
	 public void SaudiiiVision2030() throws InterruptedException {


		Actions actions = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='nav-link'][contains(.,'VISION 2030')])[1]")).click();
	    Thread.sleep(1000);
	
	    // Overview
        WebElement overview =driver.findElement(By.xpath("(//a[@href='/v2030/overview/'])[1]"));
        overview.click();
	    // scroll down
	    js.executeScript("scrollBy(0, 610)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 610)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 550)");
	    Thread.sleep(1000);
	  
	    //Return to Home Page 
	    WebElement home =driver.findElement(By.xpath("(//span[contains(.,'HOME')])[2]"));
	    home.click();
	    Thread.sleep(1000);
	    
	    //Vision 2030
		driver.findElement(By.xpath("(//a[@class='nav-link'][contains(.,'VISION 2030')])[1]")).click();
	    Thread.sleep(1000);
	    //Vision 2030 Project
	    WebElement vision2030projects =driver.findElement(By.xpath("(//a[@href='/v2030/v2030-projects/'])[1]"));
	    vision2030projects.click();
	    //Neom
	    WebElement neom =driver.findElement(By.xpath("//a[@href='/v2030/v2030-projects/neom/']"));
	    neom.click();
	    // scroll down
	    js.executeScript("scrollBy(0, 300)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 500)");
	    Thread.sleep(2000);
	    js.executeScript("scrollBy(0, 500)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 800)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 200)");
	    Thread.sleep(1000);
	    
	    //Return to Home Page 
	    WebElement home2 =driver.findElement(By.xpath("(//span[contains(.,'HOME')])[2]"));
	    home2.click();
	    Thread.sleep(1000);
		
        //Media Center
		driver.findElement(By.xpath("(//a[@class='nav-link'])[4]")).click();
	    Thread.sleep(1000);		
		//Media
	    WebElement Media =driver.findElement(By.xpath("(//a[@href='/mediacenter/media/'])[1]"));
	    Media.click();

        // New Window
		js.executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		Thread.sleep(1000);
		// Switch to a new tab
		driver.switchTo().window(tabs.get(1));
		String urlEle = "https://www.vision2030.gov.sa/mediacenter/media/pep-video/";
		driver.get(urlEle);
		Thread.sleep(1000);
		//video
		WebElement video =driver.findElement(By.xpath("//span[contains(.,'WATCH VIDEO')]"));
	    video.click();
	    Thread.sleep(90000);
		driver.close();
		// switch back control to old tab
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(1000);
		
		//Return to Home Page 
	    WebElement home3 =driver.findElement(By.xpath("(//span[contains(.,'HOME')])[2]"));
	    home3.click();
	    Thread.sleep(1000);
	    
	    //About The Kingdom 
		driver.findElement(By.xpath("(//a[@class='nav-link'])[3]")).click();
	    Thread.sleep(1000);
	    //Explore Saudi Arabia
	    WebElement exploresaudiarabia =driver.findElement(By.xpath("(//a[@href='/thekingdom/explore/'])[1]"));
	    exploresaudiarabia.click();
	    //scroll down
	    js.executeScript("scrollBy(0, 450)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 450)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 450)");
	    Thread.sleep(1000);
	    //Explore Multimedia
	    WebElement multimedia =driver.findElement(By.xpath("//a[@href='/thekingdom/explore/multimedia/']"));
	    multimedia.click();
	    js.executeScript("scrollBy(0, 350)");
	    Thread.sleep(1000);
	    //See
	    WebElement see =driver.findElement(By.xpath("//a[@data-grid='See']"));
	    see.click();
	    WebElement see1 =driver.findElement(By.xpath("//img[@src='/media/f5zplgcs/ali_mub_0397-riyadh-see.png']"));
	    see1.click();
	    Thread.sleep(1000);
	    WebElement close =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close.click();
	    WebElement see2 =driver.findElement(By.xpath("//img[@src='/media/wtvk1bup/umlj-see.png']"));
	    see2.click();
	    Thread.sleep(1000);
	    WebElement close1 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close1.click();
	    
	    //Smell
	    WebElement smell =driver.findElement(By.xpath("//a[@data-grid='Smell']"));
	    smell.click();
	    WebElement smell1 =driver.findElement(By.xpath("//img[@src='/media/q0ofaqtx/copy-taif-roses-smell.png']"));
	    smell1.click();
	    Thread.sleep(1000);
	    WebElement run =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--play']"));
	    run.click();
	    Thread.sleep(1000);
	    WebElement pause =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--pause']"));
	    pause.click();
	    WebElement close2 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close2.click();
	    
	    //Taste
	    WebElement taste =driver.findElement(By.xpath("//a[@data-grid='Taste']"));
	    taste.click();
	    WebElement taste1 =driver.findElement(By.xpath("//img[@src='/media/zyhhi5ll/dates-festival-alula-taste.png']"));
	    taste1.click();
	    Thread.sleep(1000);
	    WebElement close3 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close3.click();
	    WebElement taste2 =driver.findElement(By.xpath("//img[@src='/media/1zvhv2ep/الكليجا-القصيمية-7-qassim-taste.png']"));
	    taste2.click();
	    Thread.sleep(1000);
	    WebElement close4 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close4.click();
	    WebElement taste3 =driver.findElement(By.xpath("//img[@src='/media/v5rdbmli/التمر-السكري-1-taste.png']"));
	    taste3.click();
	    Thread.sleep(1000);
	    WebElement close5 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close5.click();
	    
	    //Hear
	    WebElement hear =driver.findElement(By.xpath("//a[@data-grid='Hear']"));
	    hear.click();
	    WebElement hear1 =driver.findElement(By.xpath("//img[@src='/media/g4easqk0/ay8_2064-hear.png']"));
	    hear1.click();
	    Thread.sleep(1000);
	    WebElement close6 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close6.click();
	    WebElement hear2 =driver.findElement(By.xpath("//img[@src='/media/f3mf0a2m/najd-dance-hear.png']"));
	    hear2.click();
	    Thread.sleep(1000);
	    WebElement close7 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close7.click();
	    //Touch
	    WebElement touch =driver.findElement(By.xpath("//a[@data-grid='Touch']"));
	    touch.click();
	    WebElement touch1 =driver.findElement(By.xpath("//img[@src='/media/gjio5551/الصوف-1-albaha-touch.png']"));
	    touch1.click();
	    Thread.sleep(1000);
	    WebElement close8 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close8.click();
	    WebElement touch2 =driver.findElement(By.xpath("//img[@src='/media/js0dzyby/901a0233-edit-trsdc-touch.png']"));
	    touch2.click();
	    Thread.sleep(1000);
	    WebElement close9 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close9.click();
	    WebElement touch3 =driver.findElement(By.xpath("//img[@src='/media/qpyl4mub/tabuk-jabal-alawz-touch.png']"));
	    touch3.click();
	    Thread.sleep(1000);
	    WebElement close10 =driver.findElement(By.xpath("//button[@class='fancybox-button fancybox-button--close']"));
	    close10.click();
	    
	    //Return to Home Page 
	    WebElement home4 =driver.findElement(By.xpath("(//span[contains(.,'HOME')])[2]"));
	    home4.click();
	    Thread.sleep(1000);
	    
	    //Contact
	    driver.findElement(By.xpath("(//span[contains(.,'CONTACT')])[1]")).click();
	    Thread.sleep(1000);
	    //scroll down
	    js.executeScript("scrollBy(0, 450)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 450)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 580)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 570)");
	    Thread.sleep(1000);
	    js.executeScript("scrollBy(0, 200)");
	    Thread.sleep(1000);
	    
	  //Return to Home Page 
	    WebElement home5 =driver.findElement(By.xpath("(//span[contains(.,'HOME')])[2]"));
	    home5.click();
	    Thread.sleep(1000);
}
}
