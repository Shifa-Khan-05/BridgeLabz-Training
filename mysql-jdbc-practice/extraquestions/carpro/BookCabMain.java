import java.time.LocalDate;
import java.util.*;

public class BookCabMain {

    private Map<String, LocalDate> bookingMap = new HashMap<>();

    public Map<String, LocalDate> getBookingMap() {
        return bookingMap;
    }

    public void setBookingMap(Map<String, LocalDate> bookingMap) {
        this.bookingMap = bookingMap;
    }

    public void addBookings(String bookingId, LocalDate dateOfBooking) {
        bookingMap.put(bookingId, dateOfBooking);
    }

    public List<String> findCabBookingIdsForTheBookingDate(LocalDate date) {

        List<String> idList = new ArrayList<>();

        for (Map.Entry<String, LocalDate> entry : bookingMap.entrySet()) {
            if (entry.getValue().equals(date)) {
                idList.add(entry.getKey());
            }
        }

        return idList;
    }
}
