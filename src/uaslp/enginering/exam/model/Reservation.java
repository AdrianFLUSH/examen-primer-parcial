package uaslp.enginering.exam.model;

public class Reservation
{
    private int RoomNumber;
    private String ArrivalDate;
    private Guest Guest;
    private int Nights;

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        RoomNumber = roomNumber;
    }

    public String getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public uaslp.enginering.exam.model.Guest getGuest() {
        return Guest;
    }

    public void setGuest(uaslp.enginering.exam.model.Guest guest) {
        Guest = guest;
    }

    public int getNights() {
        return Nights;
    }

    public void setNights(int nights) {
        Nights = nights;
    }
}