package AbstractFactory.Ant;

import AbstractFactory.Label;

public class AntLabel implements Label {

    @Override
    public void render() {
        System.out.println("Ant Label");
    }
}
