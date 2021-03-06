package eu.brugger.martin.acceptance.framework.page;

import eu.brugger.martin.acceptance.framework.component.LoginForm;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import static eu.brugger.martin.acceptance.framework.utils.Waiter.TimeOutConstants.DEFAULT_TIMEOUT_5_000_MS;

@Component
public class LoginPage extends BasePage {

    private String PAGE_URL = "%s/login";
    private static final String PAGE_HEADER = "Sign in to GitHub";
    public static final String PAGE_IDENTIFIER = "Login page";

    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;
    @FindBy(css = "form h1")
    WebElement header;

    @Autowired
    LoginForm loginForm;

    @Override
    public void open() {
        driverProvider.getInstance().get(String.format(PAGE_URL, baseUrl));
    }

    @Override
    public boolean isOpened() {
        boolean isUrlCorrect = String.format(PAGE_URL, baseUrl).equals(driverProvider.getInstance().getCurrentUrl());
        boolean isHeaderCorrect = PAGE_HEADER.equals(header.getText());
        return isUrlCorrect && isHeaderCorrect;
    }

    public void signIn() {
        loginForm.setUsernameInput(username);
        loginForm.setPasswordInput(password);
        loginForm.clickSignInButton();
    }

    @Override
    public void waitUntilPageOpened() {
        boolean isOpened = isOpened();
        waiter.waitUntilExpected(webDriver -> isOpened(), DEFAULT_TIMEOUT_5_000_MS);
    }

}
