package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBookMap = new HashMap<>();
    private List<String> phoneNumbers;
    public void add(String surname, String phoneNumber) {
        if (phoneBookMap.containsKey(surname)) {
            phoneNumbers = phoneBookMap.get(surname);
            phoneNumbers.add(phoneNumber);
            phoneBookMap.put(surname, phoneNumbers);
        } else {
            phoneNumbers = new ArrayList<>();
            phoneNumbers.add(phoneNumber);
            phoneBookMap.put(surname, phoneNumbers);
        }
    }
    public List<String> get(String surname) {
        return phoneBookMap.get(surname);
    }
}




