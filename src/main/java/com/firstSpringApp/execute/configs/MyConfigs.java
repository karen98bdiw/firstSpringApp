package com.firstSpringApp.execute.configs;

import com.firstSpringApp.execute.days.*;
import com.firstSpringApp.execute.entities.Cat;
import com.firstSpringApp.execute.entities.Dog;
import com.firstSpringApp.execute.entities.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Configuration
public class MyConfigs {

    @Bean
    public Cat getCat() {
        return new Cat();
    }

    @Bean("parrot-kesha")
    public Parrot weNeedMoreParrots() {
        return new Parrot();
    }

    @Bean
    public Dog getDog(){
        return new Dog();
    }

    @Bean
    public Cat getCat(Parrot parrot) {
        Cat cat = new Cat();
        cat.setName(parrot.getName() + "-killer");
        return cat;
    }

    @Bean
    public WeekDays getDay(){
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        switch (dayOfWeek) {
            case MONDAY: return new Monday();
            case TUESDAY: return new Tuesday();
            case WEDNESDAY: return new Wednesday();
            case THURSDAY: return new Thursday();
            case FRIDAY: return new Friday();
            case SATURDAY: return new Saturday();
            default: return new Sunday();
        }
    }



}
