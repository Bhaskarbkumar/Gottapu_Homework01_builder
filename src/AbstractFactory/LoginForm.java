package AbstractFactory;

import AbstractFactory.Ant.AntButton;
import AbstractFactory.Ant.AntTextBox;

public class LoginForm {

    public void render(WidgetFactory factory){
        factory.createButton().render();
        factory.createGrid().render();
        factory.createTextBox().render();

    }
}
