package bg.sofia.uni.fmi.mjt.escaperoom;

import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.PlatformCapacityExceededException;
import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.RoomAlreadyExistsException;
import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.RoomNotFoundException;
import bg.sofia.uni.fmi.mjt.escaperoom.exceptions.TeamNotFoundException;
import bg.sofia.uni.fmi.mjt.escaperoom.room.EscapeRoom;
import bg.sofia.uni.fmi.mjt.escaperoom.room.Review;
import bg.sofia.uni.fmi.mjt.escaperoom.team.Team;

import java.util.Arrays;

public class EscapeRoomPlatfrom implements EscapeRoomAdminAPI, EscapeRoomPortalAPI{

    private EscapeRoom[] rooms;
    private int maxCapacity;
    private int currentSize;

    private Team[] teams;

   public EscapeRoomPlatfrom(Team[] teams, int maxCapacity){

       this.teams = Arrays.copyOf(teams, teams.length);

       this.maxCapacity = maxCapacity;
       this.rooms = new EscapeRoom[this.maxCapacity];
       this.currentSize = 0;
   }

   private final Team getTeamByName(String teamName){

       for (Team team : teams) {
           if (teamName.equals(team.getName())) return team;
       }

       return null;
   }

   @Override
   public final void addEscapeRoom(EscapeRoom room)
           throws RoomAlreadyExistsException, PlatformCapacityExceededException {

       if(room == null){
           throw new IllegalArgumentException("Empty room is trying to be inserted");
       }

       if(currentSize == maxCapacity){
           throw new PlatformCapacityExceededException("New rooms cannot be inserted since a limit is reached");
       }

       EscapeRoom tempRoom = getEscapeRoomByName(room.getName());

       if(tempRoom != null){
           throw new RoomAlreadyExistsException("This escape room already exists");
       }


       this.rooms[currentSize] = room;
       this.currentSize++;
   }

   @Override
    public final void removeEscapeRoom(String roomName)
           throws RoomNotFoundException{

       if(roomName.isBlank() || roomName.isEmpty()){
           throw new IllegalArgumentException("The name of the room should not be empty");
       }

       //returns null even when we dont have rooms
       EscapeRoom temp = getEscapeRoomByName(roomName);
       if(temp == null){
           throw new RoomNotFoundException("It doesnt exists a room with such name");
       }

       EscapeRoom[] newRooms = new EscapeRoom[this.maxCapacity];
       int newIndex = 0;

       for (int i = 0; i < rooms.length; i++) {
           if(rooms[i].getName().equals(roomName)) continue;
           else {
               newRooms[newIndex] = rooms[i];
               newIndex++;
           }
       }

       //now rooms points to the newly created EscapeRoom arrays
       rooms = newRooms;
       this.currentSize = newIndex;
   }

   @Override
   public final EscapeRoom[] getAllEscapeRooms(){
       return this.rooms;
   }

   @Override
   public final void registerAchievement(String roomName, String teamName, int escapeTime)
       throws RoomNotFoundException, TeamNotFoundException{

       if(roomName.isBlank() || roomName.isEmpty()){
           throw new IllegalArgumentException("The name of the room should not be empty or blank");
       }

       if(teamName.isBlank() || teamName.isEmpty()){
           throw new IllegalArgumentException("The name of the team should not be empty or blank");
       }

       if(escapeTime <= 0) {
           throw new IllegalArgumentException("The escapeTime for the team should not be lower than or 0");
       }

       EscapeRoom room = getEscapeRoomByName(roomName);
       if(room == null){
           throw new RoomNotFoundException("A room which such name was not found");
       }

       Team team = getTeamByName(teamName);
       if(team == null){
           throw new TeamNotFoundException("A team which such name was not found");
       }

       if(escapeTime > room.getMaxTimeEscape()){
           throw new  IllegalArgumentException("The escape time should not extends the maximum escape time for the room");
       }

       int raitingGained = 0;

       //calculation of the raiting
       raitingGained += room.getDifficulty().getRank();
       if(escapeTime <= room.getMaxTimeEscape()/2){
           raitingGained+=2;
       }
       else if(escapeTime >= room.getMaxTimeEscape()/2 && escapeTime<= (room.getMaxTimeEscape()/2) + room.getMaxTimeEscape()/4){
           raitingGained+=1;
       }

       team.updateRating(raitingGained);
   }

   @Override
   public final EscapeRoom getEscapeRoomByName(String roomName) {

       for (EscapeRoom room: rooms) {
           if(room.getName().equals(roomName)) return room;
       }

       return null;
   }

   @Override
   public final void reviewEscapeRoom(String roomName, Review review)
       throws RoomNotFoundException{

       if(roomName.isEmpty() || roomName.isBlank()){
           throw new IllegalArgumentException("The name of the room should not be blank or empty");
       }

       EscapeRoom room = getEscapeRoomByName(roomName);
       if(room == null) throw new RoomNotFoundException("A room with such name wasnt found");

       room.addReview(review);
   }

   @Override
   public final Review[] getReviews(String roomName)
       throws RoomNotFoundException{

       if(roomName.isBlank() || roomName.isEmpty()){
           throw new IllegalArgumentException("The name of the room should not be empty or blank");
       }

       EscapeRoom room = getEscapeRoomByName(roomName);
       if(room == null) throw new RoomNotFoundException("A room with such name was not found");

       return room.getReviews();
   }

   @Override
   public final Team getTopTeamByRating(){

       Team maxTeam = teams[0];

       for (Team team : teams) {
           if(team.getRating() > maxTeam.getRating()) maxTeam = team;
       }
       
       return maxTeam;
   }

}
