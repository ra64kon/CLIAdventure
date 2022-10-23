package de.ra64kon.cliadventure;

import java.util.HashMap;
import java.util.Iterator;

public class Room {

private String name;
private String description;
private HashMap<String, Room> roomMap = new HashMap<String, Room>();

/**
 * 
 * TODO: Die List muss global sein, sonst kann man nicht im Kreis gehen
 * 
 * 
 * @param name
 * @param description
 * @return
 */
public String addRoom(String name, String description){
    Room returnValue = roomMap.put(description, new Room(name, description));
    if (returnValue==null) return "Raum '" + name + "'' angelegt.";
    else return "Es existiert bereits ein Raum '" + name + "' mit der Beschreibung '" + description + "'";
}

public Room(String name, String description) {
    this.name = name;
    this.description = description;
}



public String getName() {
    return name;
}



public String getDescription() {
    return description;
}

public String show() 
{
    Iterator<Room> i = roomMap.values().iterator();
    String roomInfo = "";
    if(i.hasNext()) roomInfo = "Du kannst folgendes sehen: ";
    while(i.hasNext()){
        roomInfo = roomInfo + i.next().name;
        if(i.hasNext()) roomInfo = roomInfo + ", ";
    } 
    return name + ": " + description + "\n" + roomInfo;
}




}
