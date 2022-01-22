package AbstractFactory.Bharath;

import AbstractFactory.Button;
import AbstractFactory.Grid;
import AbstractFactory.TextBox;
import AbstractFactory.WidgetFactory;

public class BharathWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new BharathButton();
    }

    @Override
    public TextBox createTextBox() {
        return new BharathTextBox();
    }

    @Override
    public Grid createGrid() {
        return new BharathGrid();
    }
}
