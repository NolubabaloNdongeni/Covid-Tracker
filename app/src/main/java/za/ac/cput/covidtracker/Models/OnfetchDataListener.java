package za.ac.cput.covidtracker.Models;

import java.util.List;

public interface OnfetchDataListener {
//Creating two methods for this class
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);


}
