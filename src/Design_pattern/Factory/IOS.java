package Design_pattern.Factory;

import Design_pattern.Factory.components.button.Button;
import Design_pattern.Factory.components.button.IOSButton;
import Design_pattern.Factory.components.dropdown.Dropdown;
import Design_pattern.Factory.components.dropdown.IOSDropdown;
import Design_pattern.Factory.components.menu.IOSMenu;
import Design_pattern.Factory.components.menu.Menu;

public class IOS implements UIFactory{

    @Override
    public IOSButton createbutton() {
        return new IOSButton();
    }

    @Override
    public IOSMenu createmenu() {
        return new IOSMenu();
    }

    @Override
    public IOSDropdown createdropdown() {
        return new IOSDropdown();
    }

    @Override
    public void setTheme() {
        System.out.println("Setting Theme for IOS.....");
    }
}
