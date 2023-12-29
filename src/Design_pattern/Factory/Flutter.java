package Design_pattern.Factory;

public class Flutter {
    SupportedApk Apk;
    public Flutter(SupportedApk Apk){
        this.Apk = Apk;
    }

    public void setTheme(){
        System.out.println("Setting theme...");
    }

    public void setRefreshrate(){
        System.out.println("Setting refresh rate to 90Hz...");
    }

    public UIFactory getFactory(){
        return UIFactoryFactory.getUIFactoryApk(this.Apk);
    }
}
