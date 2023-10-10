package FactoryPackage;

public class UiFactoryCreator {
    public static UIfactory getUIFactoryForPlatform(SupportedPlatform platform) {
        if(platform == SupportedPlatform.Android) {
            return new AndroidUiFactory();
        } else {
            return new IosUiFactory();
        }
    }
}
