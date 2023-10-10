package FactoryPackage;

import FactoryPackage.components.Button;
import FactoryPackage.components.Menu;

public interface UIfactory {

    public Button createButton();
    public Menu createMenu();
}
