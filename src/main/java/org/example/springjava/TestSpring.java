package org.example.springjava;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplplicationcontex.xml");


//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

        Commuter commuter = context.getBean("commuter", Commuter.class);
        System.out.println(commuter);
        context.close();
    }
}
