package asu.lfespino;

import java.util.List;
import java.util.LinkedList;


public class AddressBook extends LinkedList<Entry> {

    public AddressBook() {
        super();
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();

        list.append("LIST SIZE: ").append(this.size()).append("\n");
        list.append("************************\n");
        for (Entry entry : this) {
            list.append(entry.toString());
            list.append("************************\n");
        }

        return list.toString();
    }

    public boolean add(String fName, String lName, String pNum, String email) {
        for (Entry entry : this) {
            if (entry.getEmailAddress().equals(email)) return false;
        }

        return super.add(new Entry(fName, lName, pNum, email));
    }

    public boolean remove(String email) {
        return super.removeIf(entry -> (entry.getEmailAddress().equals(email)));
    }

    public String searchBy(String type, String query) {
        StringBuilder searchResults = new StringBuilder();

        searchResults.append("SEARCH RESULTS:\n");
        searchResults.append("************************\n");
        for (Entry entry : this) {
            switch (type) {
                case "fName":
                    if (entry.getFirstName().contains(query)) {
                        searchResults.append(entry.toString());
                        searchResults.append("************************\n");
                    }
                    break;
                case "lName":
                    if (entry.getLastName().contains(query)) {
                        searchResults.append(entry.toString());
                        searchResults.append("************************\n");
                    }
                    break;
                case "pNum":
                    if (entry.getPhoneNum().contains(query)) {
                        searchResults.append(entry.toString());
                        searchResults.append("************************\n");
                    }
                    break;
                case "email":
                    if (entry.getEmailAddress().contains(query)) {
                        searchResults.append(entry.toString());
                        searchResults.append("************************\n");
                    }
                    break;
                default: return "Invalid Search!";
            }
        }

        return searchResults.toString();
    }

}
