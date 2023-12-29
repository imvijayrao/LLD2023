package Design_pattern.Factory;

import Design_pattern.Factory.components.button.AndroidButton;
import Design_pattern.Factory.components.button.Button;
import Design_pattern.Factory.components.dropdown.AndroidDropdown;
import Design_pattern.Factory.components.dropdown.Dropdown;
import Design_pattern.Factory.components.menu.AndroidMenu;
import Design_pattern.Factory.components.menu.Menu;

public class Android implements UIFactory{

    @Override
    public AndroidButton createbutton() {
        return new AndroidButton();
    }

    @Override
    public AndroidMenu createmenu() {
        return new AndroidMenu();
    }

    @Override
    public AndroidDropdown createdropdown() {
        return new AndroidDropdown();
    }

    @Override
    public void setTheme() {
        System.out.println("Setting Theme for Android.....");
    }
}