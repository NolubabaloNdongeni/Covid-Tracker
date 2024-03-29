/**
 * In this class we will create sources of the objects for the news headlines
 *
 */

package za.ac.cput.covidtracker.News;

/**
 * @Uthor: Chuma Nxazonke
 * Student number: 219181187
 * Date: 23 May 2022
 */

public class NewsHeadlines {
    //Declaring all the objects for this class
    Source source = null;
    String author = "";
    String title = "";
    String description = "";
    String url = "";
    String urlToImage = "";
    String publishedAt = "";
    String content = "";

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlToImage() {
        return urlToImage;
    }

    public void setUrlToImage(String urlToImage) {
        this.urlToImage = urlToImage;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
