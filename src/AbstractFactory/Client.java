package AbstractFactory;

import AbstractFactory.Ant.AntWidgetFactory;
import AbstractFactory.Bharath.BharathWidgetFactory;

public class Client {

    public static void main(String[] args) {

        LoginForm login = new LoginForm();
        login.render(new BharathWidgetFactory());
    }
}
