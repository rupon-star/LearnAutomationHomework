package homeworkone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
    public static WebDriver myDriver;
    public static void main(String[] args){
        Amazon.bestSellers();
        Amazon.search();
        Amazon.menu();
        Amazon.AmazonTryPrime();
        Amazon.flag();
        Amazon.Account();
        Amazon.Orders();
        Amazon.TryPrime();
        Amazon.Cart();
        Amazon.sellonamazon();
        Amazon.Blog();
        Amazon.AboutAmazon();
        Amazon.PressCenter();
        Amazon.AmazonDevices();
        Amazon.AmazonTours();
        Amazon.InvestorRelations();

    }

    public static void bestSellers() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select bestSellers on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
    }


    public static void search() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select search box on click
        myDriver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("watch");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    }

    public static void menu() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select menu on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();


    }

    public static void AmazonTryPrime() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select amazon try prime on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-logo\"]/a[1]/span[1]")).click();


    }
    public static void flag() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select flag on click
        myDriver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[1]/span")).click();


    }
    public static void Account() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select account on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[1]")).click();


    }
    public static void Orders() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Orders on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();


    }

    public static void TryPrime() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select TryPrime on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span")).click();


    }
    public static void Cart() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select Cart on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();


    }

    public static void sellonamazon() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[3]/ul/li[1]/a")).click();


    }

    public static void Blog() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")).click();


    }
    public static void AboutAmazon() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[3]/a")).click();


    }

    public static void PressCenter() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[4]/a")).click();


    }

    public static void InvestorRelations() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[5]/a")).click();


    }

    public static void AmazonDevices() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[6]/a")).click();


    }

    public static void AmazonTours() {
        //set property with browser driver name and path of the driver
        //for chrome browser


        System.setProperty("webdriver.chrome.driver", "Lib/BrowserDriver/chromedriver");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select sell on amazon on click
        myDriver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[7]/a")).click();


    }
}

