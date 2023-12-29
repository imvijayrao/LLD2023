package Design_pattern.Factory.components.button;

public class AndroidButton implements Button{
    @Override
    public void changesize() {
        System.out.println("Setting default size for Android Button.....");
    }

}
