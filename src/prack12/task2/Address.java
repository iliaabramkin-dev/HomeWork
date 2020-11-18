package prack12.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String town;
    private String district;
    private String corpus;
    private String apartment;

    public void setAddress(String s){
        String[] strings = s.replace(" ", "").split(",");
        if (strings.length == 7) {
            System.out.println("SPLIT");
            setValues(strings);
            return;
        }

        List<String> tokens = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(s, ",.;");
        while (tokenizer.hasMoreElements()){
            tokens.add(tokenizer.nextToken().trim());
        }
        setValues(tokens.toArray(strings));
    }

    private void setValues(String[] arr) {
        country = arr[0];
        region = arr[1];
        town = arr[2];
        district = arr[3];
        corpus = arr[4];
        apartment = arr[5];
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", town='" + town + '\'' +
                ", district='" + district + '\'' +
                ", corpus='" + corpus + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
