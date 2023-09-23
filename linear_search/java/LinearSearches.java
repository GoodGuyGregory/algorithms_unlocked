import java.util.ArrayList;
import java.util.List;

public class LinearSearches {

    public static void createList(List<String> blankList) {
        blankList.add("Douglas-Fir");
        blankList.add("Grand Fir");
        blankList.add("Western Redcedar");
        blankList.add("Western Hemlock");
        blankList.add("Incense Cedar");
        blankList.add("Western Juniper");
        blankList.add("Subalpine Larch");
        blankList.add("Atlas Cedar");
        blankList.add("Monkey Puzzle");
        blankList.add("Coastal Redwood");
        blankList.add("Souther Magnolia");
        blankList.add("Rhododendron");
        blankList.add("Ginko");
        blankList.add("Oregon White Oak");
        blankList.add("Sweet Gum");
        blankList.add("Pacific Dogwood");
        blankList.add("Big Leaf Maple");
        blankList.add("Sitka Spruce");
        blankList.add("Giant Sequoia");
        blankList.add("Dawn Redwood");
        blankList.add("Whitebark Pine");
        blankList.add("Ponderosa Pine");
        blankList.add("Sugar Pine");
    }

    public static String linearSearch(List<String> providedList) {
        return "Not Found";
    }

    public static String betterLinearSearch(List<String> providedList) {
        return "Not Found";
    }

    public static String sentinelLinearSearch(List<String> procidedList) {
        return "Not Found";
    }



    public static void main(String[] args) {
        
        // initialize test data...
        List<String> testList = new ArrayList<String>();
        createList(testList);



    }
}