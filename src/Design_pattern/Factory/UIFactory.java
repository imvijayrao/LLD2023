package Design_pattern.Factory;

import Design_pattern.Factory.components.button.Button;
import Design_pattern.Factory.components.dropdown.Dropdown;
import Design_pattern.Factory.components.menu.Menu;

public interface UIFactory {
    public Button createbutton();
    public Menu createmenu();
    public Dropdown createdropdown();
    public void setTheme();
}
