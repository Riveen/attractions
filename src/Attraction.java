public class Attraction {
    private int openTime;
    private int closeTime;
    private String name;
    private String location;
    public double admittanceFee;

    /*
    overloaded constructors are used.
    * */

    public Attraction(String name, int openTime, int closeTime, double admittanceFee, String location)
    {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.admittanceFee = admittanceFee;
        this.location = location;
    }

    public Attraction(String name, int openTime, int closeTime, String location)
    {
        this.name = name;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.location = location;
    }

    /*
    getters and setters.
    * */
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getOpenTime()
    {
        return openTime;
    }

    public void setOpenTime(int openTime)
    {
        this.openTime = openTime;
    }

    public int getCloseTime()
    {
        return closeTime;
    }

    public void setCloseTime(int closeTime)
    {
        this.closeTime = closeTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getAdmittanceFee()
    {
        return admittanceFee;
    }

    // returns the attraction info.
    public String displayAttractionInfo()
    {
        String info;
        info = name + " - {Opening Time: " + toString(openTime) + ", Closing Time: " + toString(closeTime) + ", Admittance Fee: £" + getAdmittanceFee() + "}";
        return info;
    }


    /*
        (\d+) captures one or more digits and matches the hour part.
        (\d{2}) captures exactly two digits and matches the minute part.
        "$1:$2" replaces the matched string with the captured groups, separated by a colon.

     */
    public String toString(int value)

    {
        return Integer.toString(value).replaceAll("(\\d+)(\\d{2})", "$1:$2");
    }

}
