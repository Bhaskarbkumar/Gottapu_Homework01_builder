package AbstractFactory.material;

import AbstractFactory.Button;
import AbstractFactory.Grid;
import AbstractFactory.TextBox;
import AbstractFactory.WidgetFactory;

public class MaterialWidgetFactory implements WidgetFactory {
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox createTextBox() {
        return new MaterialTextBox();
    }

    @Override
    public Grid createGrid() {
        return new MaterialGrid();
    }
}
