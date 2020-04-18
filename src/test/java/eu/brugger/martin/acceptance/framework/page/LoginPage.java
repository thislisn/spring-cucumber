package eu.brugger.martin.acceptance.framework.page;

import eu.brugger.martin.acceptance.framework.component.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LoginPage extends BasePage {

    @Value("${url.base}")
    private String baseUrl;
    @Value("${user.username}")
    private String username;
    @Value("${user.password}")
    private String password;

    private String PAGE_URL = "%s/login";

    @Autowired
    LoginForm loginForm;

    @Override
    public void open() {
        driverProvider.getInstance().get(String.format(PAGE_URL, baseUrl));
    }

    public void signIn() {
        loginForm.setUsernameInput(username);
        loginForm.setPasswordInput(password);
        loginForm.clickSignInButton();
    }

}
