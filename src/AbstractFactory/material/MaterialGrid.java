package AbstractFactory.material;

import AbstractFactory.Grid;

public class MaterialGrid implements Grid {
    @Override
    public void render() {
        System.out.println("Material Grid");
    }
}
