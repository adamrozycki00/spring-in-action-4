package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import knights.BraveKnight;
import knights.Knight;
import knights.Quest;
import knights.SlayDragonQuest;

@Configuration
public class SpringConfig {

    @Bean
    public Knight getKnight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
