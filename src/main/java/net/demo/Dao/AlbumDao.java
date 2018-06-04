package net.demo.Dao;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import net.demo.Entity.Album;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class AlbumDao {

    private static Map<Integer,Album> album;

    static {
        album = new HashMap<Integer, Album>(){
            {
                put(1, new Album("A001",3,"My Architecture","Leon"));
                put(1, new Album("A002",4,"My Life","Chris"));
                put(1, new Album("A003",5,"My Company","Hallow"));
                put(1, new Album("A004",6,"My House","Drain"));
            }
        };

    }

    public Collection<Album> getAllAlbum(){
        return album.values();
    }

}
