package AbstractFactory.Ant;

import AbstractFactory.*;

public class AntWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new AntButton();
    }

    @Override
    public TextBox createTextBox() {
        return new AntTextBox();
    }

    @Override
    public Grid createGrid() {
        return new AntGrid();
    }

    @Override
    public Label createLabel() {
        return new AntLabel();
    }
}
