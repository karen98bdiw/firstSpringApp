package com.firstSpringApp.execute;

import com.firstSpringApp.execute.configs.MyConfigs;
import com.firstSpringApp.execute.days.WeekDays;
import com.firstSpringApp.execute.entities.Cat;
import com.firstSpringApp.execute.entities.Dog;
import com.firstSpringApp.execute.entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigs.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean(Dog.class);
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(parrot.getName());

        WeekDays weekDays = context.getBean(WeekDays.class);

        System.out.println("Today's day is " +  " " + weekDays.getWeekDayName());

    }

}
