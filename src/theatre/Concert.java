package theatre;

import java.util.ArrayList;
import java.util.List;

public class Concert {
    private String concertHallName;
    private List<Seat> seats = new ArrayList<>();

    public Concert(String concertHallName, int numRows, int seatsPerRow) {
        this.concertHallName = concertHallName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row < lastRow; row++) {
            for (int seatNum = 0; seatNum < seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getConcertHallName() {
        return concertHallName;
    }

    public boolean reserveSeat(String seatBumber) {
        Seat requestedSeat = null;
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equals(seatBumber)) {
                requestedSeat = seat;
                break;
            }
        }
        if (requestedSeat == null) {
            System.out.println("there is no seat " + seatBumber);
            return false;
        }

        return requestedSeat.reserve();
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber() + " " + seat.reserved);
        }
    }

    class Seat {
        private final String seatNumber;
        public boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println(" Seat " + seatNumber + " reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled");
                return true;
            }
            return false;
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
class MyMain{
    public static void main(String[] args) {
        Concert concer=new Concert("SanatSaroyi",50,40 );
        concer.reserveSeat("A22");
        concer.getSeats();

    }
}
