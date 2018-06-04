package net.demo.Service;

import net.demo.Entity.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class AlbumService
{

    @Autowired
    private AlbumService albumService;

    public Collection<Album> getAllAlbum(){
        return albumService.getAllAlbum();
    }
}
