package Design_pattern.Factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryApk(SupportedApk Apk){
        return switch (Apk){
            case ANDROID -> new Android();
            case IOS -> new IOS();
        };
    }
}