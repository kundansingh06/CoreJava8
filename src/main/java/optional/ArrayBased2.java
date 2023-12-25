package optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ArrayBased2 {
    static List<String> countries = Arrays.asList("INDIA", "CANADA", "US", "CHINA");
    public static void main(String[] args) {
        String countryname = getCountry2("US");
        System.out.println(countryname);

    }

    private static String getCountry(String name) {
        String counrtyfound=null;
        for(String country:countries){
            if (country.equalsIgnoreCase(name)){
                counrtyfound=country;
                break;
            }
        }
        return counrtyfound!=null?counrtyfound:"country not found";
    }

    private static String getCountry2(String name) {
        Optional<String> first = countries.stream().filter(a -> a.startsWith(name)).findFirst();
        return first.isPresent()?first.get():"not found";
    }




}
