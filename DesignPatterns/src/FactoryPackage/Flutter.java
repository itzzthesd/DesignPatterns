package FactoryPackage;

public class Flutter {
    public void setTheme(){

    }

    public void setRefreshRate(){

    }

    public UIfactory createUiFactory(SupportedPlatform platform){
        return UiFactoryCreator.getUIFactoryForPlatform(platform);
    }

}
