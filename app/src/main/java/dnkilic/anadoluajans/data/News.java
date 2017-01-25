package dnkilic.anadoluajans.data;

public class News {

    private String title;
    private String description;
    private String image;
    private String link;
    private String pubDate;
    private String id;

    public News(String id, String title, String description, String image, String link, String pubDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.link = link;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getId() {
        return id;
    }
}
