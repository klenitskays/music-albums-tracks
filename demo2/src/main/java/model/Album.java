package model;

import jakarta.persistence.*;

import java.util.List;

@Entity

@Table(name = "albums")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    public String title;

    public String artist;

    public Integer year;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Track> tracks;
    // Конструкторы, геттеры и сеттеры
    public void setAId(Long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public Integer getYear() {
        return year;
    }
}