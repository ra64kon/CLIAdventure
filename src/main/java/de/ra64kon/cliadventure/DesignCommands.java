package de.ra64kon.cliadventure;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class DesignCommands {

    private World world = new World();
    
    @ShellMethod(value = "Raum anlegen mit Name und Beschreibung", group = "Adventure anpassen")
    public String addRoom(String name, String description) {
        return world.addRoom(name, description) + "\n";
    }

    @ShellMethod(value = "Zeigt an, was Du sehen kannst.", group = "Adventure spielen")
    public String show() {
        return world.show() + "\n";
    }
    
    

}
