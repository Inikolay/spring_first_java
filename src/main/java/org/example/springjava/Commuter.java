package org.example.springjava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Commuter {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Commuter(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Commuter "  + id + " " + musicPlayer.playMusic();
    }
}
