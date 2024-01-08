public class Theater extends Attraction{
    private int noOfSeats;
    private double ticketPrice;

    // Theater constructor
    public Theater(String name, int openTime, int closeTime, double admittanceFee, int noOfSeats, String location)
    {
        super(name, openTime, closeTime, admittanceFee, location);
        this.noOfSeats = noOfSeats;
        this.ticketPrice = admittanceFee;
    }
    public int getNoOfSeats()
    {
        return noOfSeats;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    @Override
    public String displayAttractionInfo()
    {
        String info;
        info = getName() + " - {Opening Time: " + toString(getOpenTime()) + ", Closing Time: " + toString(getCloseTime()) + ", Ticket Price: £" + getTicketPrice() + "}";
        return info;
    }
}
