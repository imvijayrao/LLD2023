package Design_pattern.Factory.components.button;

public class IOSButton implements Button{
    @Override
    public void changesize() {
        System.out.println("Setting default size for IOS Button.....");
    }
}
