package de.ra64kon.cliadventure;


public class World 
{
    private Room currentRoom = new Room("InitialRoom", "Bitte leg einen neuen Raum an.");

    public String show()
    {
        return currentRoom.show();
    }

    public String addRoom(String name, String description)
    {
        if (currentRoom.getName() == "InitialRoom")
        {
            currentRoom = new Room(name, description);
            return "Das neue Adventure startet nun mit dem Raum '" + name + "'.";
        }
        else
        {
            return currentRoom.addRoom(name, description);
        }
    }


}
