package homeworkone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonOne {
    public static void main(String[] args) {
        AmazonOne.bestSellers();
        AmazonOne.customerService();
        AmazonOne.newReleases();
        AmazonOne.findAGift();
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
    //case 1
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

    //case 2
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

    //case 3
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

    //case 4
    public static void findAGift() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
    }

    //case 5
    public static void todayDeals() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
    }

    //case 6
    public static void wholeFoods() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select wholeFoods on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).click();
    }

    //case 7
    public static void giftCards() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Select giftCards on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[7]")).click();
    }

    //case 8
    public static void registry() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).click();
    }

    //case 9
    public static void amazonBasics() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select amazonBasics on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[9]")).click();
    }

    //case 10
    public static void sell() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[10]")).click();
    }

    //case 11
    public static void coupons() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select coupons on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[11]")).click();
    }

    //case 12
    public static void founditonAmazon() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Select founditonAmazon on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[12]")).click();
    }

    //case 13
    public static void freeShipping() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");

        //Search on click
        myDriver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[13]")).click();
    }


    //case 14
    public static void shooperToolkit() {
        // Set property with browser driver name and path of the driver
        // For Chrome Browser
        System.setProperty("webdriver.chrome.driver", "Lib\\BrowserDriver\\chromedriver.exe");
        myDriver = new ChromeDriver();
        //Navigate to URL
        myDriver.get("https://www.amazon.com/");
        //Search on click
        myDriver.findElement(By.xpath(" //*[@id=\"nav-xshop\"]/a[14]")).click();
    }

}


