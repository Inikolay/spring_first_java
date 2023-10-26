package org.example.springjava;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplplicationcontex.xml");

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparison = firstMusicPlayer == secondMusicPlayer;

        System.out.println(comparison);


        firstMusicPlayer.setValue(10);

        System.out.println(firstMusicPlayer.getValue());
        System.out.println(secondMusicPlayer.getValue());

        context.close();
    }
}
