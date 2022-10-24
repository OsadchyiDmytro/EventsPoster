package Model;

import java.time.LocalDate;

public class CSVObjects {
    private EnumActionType actionType;
    private EnumEventType eventType;
    private int quantityOfTickets;
    private String title;
    private LocalDate date;

    public void setActionType(EnumActionType actionType) {
        this.actionType = actionType;
    }

    public void setEventType(EnumEventType eventType) {
        this.eventType = eventType;
    }

    public void setQuantityOfTickets(int quantityOfTickets) {
        this.quantityOfTickets = quantityOfTickets;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(LocalDate date) {

        this.date = date;
    }

    public void getTitle(String title) {

        this.title = title;
    }
}
