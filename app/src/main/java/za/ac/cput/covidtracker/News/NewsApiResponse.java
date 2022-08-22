/**
 * In this class we will create object for the news API
 *
 */

package za.ac.cput.covidtracker.News;

import java.util.List;

/**
 * @Uthor: Chuma Nxazonke
 * Student number: 219181187
 * Date: 23 May 2022
 */
public class NewsApiResponse {
//Declaring all the variables
    String status;
    int totalResults;
    List<NewsHeadlines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsHeadlines> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsHeadlines> articles) {
        this.articles = articles;
    }
}
