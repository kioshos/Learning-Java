package TaskTwo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private String name;
    private Frequency frequency;
    private LocalDate releaseDate;
    private int magazineCopies;
    private List<Article> articles;

    public Magazine(String name, Frequency frequency, LocalDate releaseDate, int circulation, List<Article> articles) {
        this.name = name;
        this.frequency = frequency;
        this.releaseDate = releaseDate;
        this.magazineCopies = circulation;
        this.articles = articles != null ? new ArrayList<>(articles) : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getMagazineCopies() {
        return magazineCopies;
    }

    public void setMagazineCopies(int magazineCopies) {
        this.magazineCopies = magazineCopies;
    }

    public List<Article> getArticles() {
        return new ArrayList<>(articles);
    }
    public void setArticles(List<Article> articles) {
        this.articles = articles != null ? new ArrayList<>(articles) : new ArrayList<>();
    }
    public void PrintArticles() {
        System.out.println("Magazine: " + name + " (" + frequency + ")");
        for (Article article : articles) {
            System.out.println(" - " + article.getTitle() + " (Rating: " + article.getRating() + ")");
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", releaseDate=" + releaseDate +
                ", magazineCopies=" + magazineCopies +
                ", articles=" + articles +
                '}';
    }
}
