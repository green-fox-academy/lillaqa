package day1ObjectOriented.preClassTask.day1ObjectOriented.blogPost;

public class PostAttributes {

    String authorName;
    String title;
    String text;
    String publicationDate;

    public PostAttributes(String title, String authorName, String publicationDate, String text) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
}

