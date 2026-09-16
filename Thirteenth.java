import java.util.*;

class Guest {
    String name;
    int age;
    String idProof;

    Guest(String name, int age, String idProof) {
        this.name = name;
        this.age = age;
        this.idProof = idProof;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + idProof;
    }
}

class Reservation {
    String reservationId;
    String roomType;
    List<Guest> guests;

    Reservation(String reservationId, String roomType) {
        this.reservationId = reservationId;
        this.roomType = roomType;
        guests = new ArrayList<>();
    }

    void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public String toString() {
        String result = "Reservation ID: " + reservationId +
                " Room: " + roomType + "\nGuests:\n";

        for (Guest guest : guests) {
            result += guest + "\n";
        }

        return result;
    }
}

public class Thirteenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] data = sc.nextLine().split(",");

        String reservationId = data[0];
        String roomType = data[1];
        int n = Integer.parseInt(data[2]);

        Reservation reservation = new Reservation(reservationId, roomType);

        for (int i = 0; i < n; i++) {
            String[] guestData = sc.nextLine().split(",");

            Guest guest = new Guest(
                    guestData[0],
                    Integer.parseInt(guestData[1]),
                    guestData[2]
            );

            reservation.addGuest(guest);
        }

        System.out.println(reservation);
    }
}