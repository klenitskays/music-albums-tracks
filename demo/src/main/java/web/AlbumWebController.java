package web;

import model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.AlbumService;

import java.util.List;

@Controller
public class AlbumWebController {

    private final AlbumService albumService;

    @Autowired
    public AlbumWebController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @GetMapping("/albums")
    public String getAllAlbums(Model model) {
        List<Album> albums = albumService.getAllAlbums();
        model.addAttribute("albums", albums);
        return "album-list";
    }
}
