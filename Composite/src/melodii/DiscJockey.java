package melodii;

public class DiscJockey{

    SongComponent songList;

    // newSongList contains every melodii.Song, melodii.SongGroup,
    // and any Songs saved in SongGroups

    public DiscJockey(SongComponent newSongList){

        songList = newSongList;

    }

    // Calls the displaySongInfo() on every melodii.Song
    // or melodii.SongGroup stored in songList

    public void getSongList(){

        songList.displaySongInfo();

    }

}