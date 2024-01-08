public class Museum extends Attraction{
    private boolean hasFreeEntry;

    // Museum constructor
    public Museum(String name, int openTime, int closeTime, double admittanceFee, boolean hasFreeAdmittance, String location)
    {
        super(name, openTime, closeTime, admittanceFee, location);
        this.hasFreeEntry = hasFreeAdmittance;
    }

    @Override
    public double getAdmittanceFee() {
        return hasFreeEntry ? 0.0 : admittanceFee;
    }

    @Override
    public String displayAttractionInfo() {
        String info;
        info = getName() + " - {Opening Time: " + toString(getOpenTime()) + ", Closing Time: " + toString(getCloseTime()) + ", Entry Fee: £" + getAdmittanceFee() + "}";
        return info;
    }
}
