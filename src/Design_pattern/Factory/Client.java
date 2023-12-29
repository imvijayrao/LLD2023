package Design_pattern.Factory;

import Design_pattern.Factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter =  new Flutter(SupportedApk.ANDROID);
        UIFactory uiFactory = flutter.getFactory();
        uiFactory.setTheme();
        Button button = uiFactory.createbutton();
        button.changesize();
    }
}