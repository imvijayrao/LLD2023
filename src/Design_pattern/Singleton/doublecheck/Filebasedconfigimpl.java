package Design_pattern.Singleton.doublecheck;

public class Filebasedconfigimpl {
    private static Filebasedconfigimpl filebasedconfigimpl = null;

    private Filebasedconfigimpl(){}

    public static Filebasedconfigimpl getInstance(){
        if(filebasedconfigimpl == null){
            synchronized (Filebasedconfigimpl.class){
                if(filebasedconfigimpl == null){
                    filebasedconfigimpl = new Filebasedconfigimpl();
                    System.out.println("Instance created using double check");
                }
            }
        }
        return filebasedconfigimpl;
    }
}
