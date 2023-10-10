package FactoryPackage;

import FactoryPackage.components.Button;
import FactoryPackage.components.IosButton;
import FactoryPackage.components.IosMenu;
import FactoryPackage.components.Menu;

public class IosUiFactory implements UIfactory{
    @Override
    public IosButton createButton() {
        return  new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }
}
