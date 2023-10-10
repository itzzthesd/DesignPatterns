package FactoryPackage;

import FactoryPackage.components.Button;

public class Client {
    public static void main(String[] args) {
        Flutter f = new Flutter();
        UIfactory u = UiFactoryCreator.getUIFactoryForPlatform(SupportedPlatform.Ios);

        Button b = u.createButton();
        System.out.println(b);
    }
}
