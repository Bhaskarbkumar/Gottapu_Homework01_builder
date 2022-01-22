package AbstractFactory.material;

import AbstractFactory.*;

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

    @Override
    public Label createLabel() {
        return new MaterialLabel();
    }
}
