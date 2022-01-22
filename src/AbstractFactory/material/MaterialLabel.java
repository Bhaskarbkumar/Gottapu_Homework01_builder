package AbstractFactory.material;

import AbstractFactory.Label;

public class MaterialLabel implements Label {
    @Override
    public void render() {
        System.out.println("Material Label");
    }
}
