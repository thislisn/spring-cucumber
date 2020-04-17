package eu.brugger.martin.acceptance.framework.component;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LoginForm extends BaseComponent {

    @FindBy(css = "input#login_field")
    WebElement usernameInput;
    @FindBy(css = "input#password")
    WebElement passwordInput;
    @FindBy(css = "input.btn-primary")
    WebElement signInButton;

    public void setUsernameInput(String username){
        usernameInput.isDisplayed();
        waiter.waitUntilWebElementDisplayed(usernameInput);
        usernameInput.sendKeys(username);
    }

    public void setPasswordInput(String password){
        waiter.waitUntilWebElementDisplayed(passwordInput);
        usernameInput.sendKeys(password);
    }

    public void clickSignInButton(){
        waiter.waitUntilWebElementDisplayed(signInButton);
        signInButton.click();
    }
}
