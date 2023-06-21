package controller;

import model.Track;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.TrackService;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
public class TrackController {

    private final TrackService trackService;

    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }

    @GetMapping("/")
    public List<Track> getAllTracks() {
        return trackService.getAllTracks();
    }

    @GetMapping("/{id}")
    public Track getTrackById(@PathVariable Long id) {
        return trackService.getTrackById(id);
    }

    @PostMapping("/")
    public Track createTrack(@RequestBody Track track) {
        return trackService.createTrack(track);
    }

    @PutMapping("/{id}")
    public Track updateTrack(@PathVariable Long id, @RequestBody Track trackDetails) {
        return trackService.updateTrack(id, trackDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTrack(@PathVariable Long id) {
        trackService.deleteTrack(id);
        return ResponseEntity.noContent().build();
    }
}