import java.util.*;

class Room {
    String roomNumber;
    String block;
    String type;

    Room(String roomNumber, String block, String type) {
        this.roomNumber = roomNumber;
        this.block = block;
        this.type = type;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getBlock() {
        return block;
    }

    public String getType() {
        return type;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Student1 {
    String name;
    int roll;
    String course;
    Room room;

    Student1(String name, int roll, String course, Room room) {
        this.name = name;
        this.roll = roll;
        this.course = course;
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (" + roll + ") " + course +
                "\nRoom: " + room.getRoomNumber() + " " +
                room.getBlock() + " " + room.getType();
    }
}

public class Eleventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        Room room = new Room(data[3], data[4], data[5]);

        Student1 student = new Student1(
                data[0],
                Integer.parseInt(data[1]),
                data[2],
                room
        );

        System.out.println(student);
    }
}