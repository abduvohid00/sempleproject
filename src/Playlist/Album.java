package Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    SongList songList;

    private class SongList{
        private ArrayList<Song> songs;

        public ArrayList<Song> getSongs() {
            return songs;
        }

        public SongList() {
            this.songs = new ArrayList<>();
        }
        public boolean add(Song song){
            if (songs.contains(song)){
                return false;
            }else {
                return songs.add(song);
            }
        }
        public Song findSong(String title){
            for (Song song: songs) {
                if (song.getTitle().equals(title)){
                    return song;
                }
            }
            return null;
        }
        public Song findSong(int orderNumber){
            int amountOfSong=orderNumber-1;

            for (int i = 0; i <songs.size() ; i++) {
                if (i==amountOfSong){
                    return songs.get(amountOfSong);
                }
            }
            return null;
        }
    }



    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList=new SongList();

    }

        public boolean addSong(String songTitle,double songDuration){
        if (songList.findSong(songTitle)==null){
            return songList.add(new Song(songTitle,songDuration));
        }
        return false;
    }
    /*public Song finsdSong(String songName){

        for (Song songExsist:
                songList.getSongs()) {
            if (songExsist.getTitle().equals(songName)){
                return songExsist;
            }
        }
        return null;
    }*/

    public boolean addToPlayList(int oderNumberOfSongs, LinkedList<Song> linkedPlayList ){
        if (songList.findSong(oderNumberOfSongs)!=null){
            return linkedPlayList.add(songList.findSong(oderNumberOfSongs));
        }
        return false;
    }
    public boolean addToPlayList(String nameOfSong, LinkedList<Song> addViaSongName ){

        if (songList.findSong(nameOfSong)!=null){
               return addViaSongName.add(songList.findSong(nameOfSong));
            }

        return false;
    }
    public ArrayList<Song> getSongs() {
        return songList.getSongs();
    }


}
