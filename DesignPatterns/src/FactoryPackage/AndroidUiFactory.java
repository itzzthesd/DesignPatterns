package FactoryPackage;

import FactoryPackage.components.AndroidButton;
import FactoryPackage.components.AndroidMenu;
import FactoryPackage.components.Button;
import FactoryPackage.components.Menu;

public class AndroidUiFactory implements UIfactory{
    @Override
    public AndroidButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createMenu() {
        return new AndroidMenu();
    }
}
