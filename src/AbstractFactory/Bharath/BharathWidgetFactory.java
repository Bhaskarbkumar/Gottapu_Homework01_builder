package AbstractFactory.Bharath;

import AbstractFactory.*;

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

    @Override
    public Label createLabel() {
        return new BharathLabel();
    }
}
