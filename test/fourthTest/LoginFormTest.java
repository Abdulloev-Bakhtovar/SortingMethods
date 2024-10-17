import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class LoginFormTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://localhost:8080/yourapp/login.jsp"); // Замените на URL вашего приложения
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLoginWithLettersShowsError() {
        WebElement inputField = driver.findElement(By.id("inputField"));
        inputField.sendKeys("abc");

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        WebElement errorMessage = driver.findElement(By.id("errorMessage"));
        assertTrue(errorMessage.isDisplayed(), "Сообщение об ошибке должно отображаться при вводе букв");
        assertEquals("Неверный формат ввода. Пожалуйста, введите число.", errorMessage.getText(), "Текст ошибки должен быть верным");
    }

    @Test
    public void testLoginWithNumbersSuccess() {
        WebElement inputField = driver.findElement(By.id("inputField"));
        inputField.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();

        WebElement successMessage = driver.findElement(By.id("successMessage"));
        assertTrue(successMessage.isDisplayed(), "Сообщение об успехе должно отображаться при вводе чисел");
    }
}
