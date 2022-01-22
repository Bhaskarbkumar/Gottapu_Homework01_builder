package AbstractFactory.Ant;

import AbstractFactory.Button;
import AbstractFactory.Grid;
import AbstractFactory.TextBox;
import AbstractFactory.WidgetFactory;

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
}
