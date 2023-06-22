package repository;

import model.Album;
import model.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrackRepository extends JpaRepository<Track, Long> {
    List<Track> findByArtist(String artist);

    List<Track> findByAlbum(Track track);
    List<Track> findAll();
    Optional<Track> findById(Long id);
    Track save(Track track);
    void delete(Track track);
}