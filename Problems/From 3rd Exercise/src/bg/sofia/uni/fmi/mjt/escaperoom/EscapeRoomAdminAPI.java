package bg.sofia.uni.fmi.mjt.escaperoom;

import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.PlatformCapacityExceededException;
import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.RoomAlreadyExistsException;
import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.RoomNotFoundException;
import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.TeamNotFoundException;
import bg.sofia.uni.fmi.mjt.escaperoom.room.EscapeRoom;

public interface EscapeRoomAdminAPI {

    void addEscapeRoom(EscapeRoom room) throws RoomAlreadyExistsException, PlatformCapacityExceededException;
    void removeEscapeRoom(String roomName) throws RoomNotFoundException;


    EscapeRoom[] getAllEscapeRooms();

    void registerAchievement(String roomName, String teamName, int escapeTime)
        throws RoomNotFoundException, TeamNotFoundException;
}
