package homeworkone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOne {
    public static void main(String[] args) {
        AmazonOne.bestSellers();
        AmazonOne.customerService();
        AmazonOne.newReleases();
        AmazonOne.findaGift();
        AmazonOne.todayDeals();
        AmazonOne.wholeFoods();
        AmazonOne.giftCards();
        AmazonOne.registry();
        AmazonOne.amazonBasics();
        AmazonOne.sell();
        AmazonOne.coupons();
        AmazonOne.founditonAmazon();
        AmazonOne.freeShipping();
        AmazonOne.shooperToolkit();

    }

    public static WebDriver myDriver;

    public static void bestSellers() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select bestSellers on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();


    }


    public static void customerService() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select  customerService on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();


    }


    public static void newReleases() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();


    }


    public static void findaGift() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();


    }


    public static void todayDeals() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }

    public static void wholeFoods() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select wholeFoods on click
        myDriver.findElement(By.xpath("          ")).sendKeys("milk");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }


    public static void giftCards() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select giftCards on click
        myDriver.findElement(By.xpath("          ")).sendKeys("card");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }


    public static void registry() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }

    public static void amazonBasics() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select amazonBasics on click
        myDriver.findElement(By.xpath("          ")).sendKeys("home");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }

    public static void sell() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }

    public static void coupons() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select coupons on click
        myDriver.findElement(By.xpath("          ")).sendKeys("beauty");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }


    public static void founditonAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select founditonAmazon on click
        myDriver.findElement(By.xpath("          ")).sendKeys("software");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }

    public static void freeShipping() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }

    public static void shooperToolkit() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");


        //Search on click
        myDriver.findElement(By.xpath("          ")).click();


    }






}


