package za.ac.cput.covidtracker.Models;

public interface OnfetchDataListener {

    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);


}
