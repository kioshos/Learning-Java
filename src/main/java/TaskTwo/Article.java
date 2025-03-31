package TaskTwo;

public class Article {

    private Human author;
    private String title;
    private double rating;
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 0.0 and 5.0");
        }
    }
    public Human getAuthor() {
        return author;
    }

    public void setAuthor(Human author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public Article(Human author, String title, double rating) {
        this.author = author;
        this.title = title;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Article{" +
                "author=" + author +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
