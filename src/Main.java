
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int count=0;

        Attraction attractionArray[] = new Attraction[5];
        attractionArray[0] = new Park("Washington state park", 1300, 2300, "Washington, DC");
        attractionArray[1] = new Museum("Texas State Art Museum", 1930, 2200, 2.5, false, "Austin, Texas");
        attractionArray[2] = new Museum("Science Museum of Technological Arts", 1305, 1800, 2.5, true, "3303 Water St NW");
        attractionArray[3] = new Theater("Junior High Theater", 2000, 2300, 1.6, 100, "Brooklyn, NYC");
        attractionArray[4] = new Theater("Las Vegas Mega Theater",  2000, 300, 4.8, 200, "Las Vegas, Nevada");

        AttractionList attractionList = new AttractionList();

        attractionList.attractions.addAll(Arrays.asList(attractionArray));

        System.out.println("Attractions which are open after 19:00 and less than £5:\n");

        for(Attraction attractions : attractionList.attractions){
            if (attractions.getOpenTime() > 1900 && attractions.getAdmittanceFee() < 5.0)
            {
                count++;
                System.out.println(count + "." + attractions.displayAttractionInfo());
            }
        }
    }
}