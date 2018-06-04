package net.demo.Controller;

import net.demo.Dao.AlbumDao;
import net.demo.Entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumDao albumDao;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Album> getAllAlbum(){
        return albumDao.getAllAlbum();
    }
}
