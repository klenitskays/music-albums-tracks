package repository;

import model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

        List<Album> findByTitle(String title);

        List<Album> findByArtist(String artist);

        List<Album> findByYear(int year);
    List<Album> findAll();
    Optional<Album> findById(Long id);
    Album save(Album album);
     void delete(Album album);

}
