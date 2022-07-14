package com.company;

import com.company.models.Adapter.Captain;
import com.company.models.Adapter.FishingBoatAdapter;
import com.company.models.Bridge.Axe;
import com.company.models.Bridge.FlyingEnchantment;
import com.company.models.Bridge.Weapon;
import com.company.models.Builder.Hero;
import com.company.models.Builder.Person;
import com.company.models.DI.OldTobyTobacco;
import com.company.models.DI.Wizard;
import com.company.models.Factory.Coin.Coin;
import com.company.models.Factory.Coin.CoinFactory;
import com.company.models.Factory.Coin.CoinType;
import com.company.models.Factory.Notification.Notification;
import com.company.models.Factory.Notification.NotificationFactory;
import com.company.models.Factory.Notification.NotificationType;
import com.company.models.Factory.Restaurant.VeggieRestaurant;
import com.company.models.Iterator.Item;
import com.company.models.Memento.Star.Star;
import com.company.models.Memento.Star.StarMementoInternal;
import com.company.models.Memento.Star.StarType;
import com.company.models.Memento.Student.Student;
import com.company.models.Memento.Student.StudentMemento;
import com.company.models.Observer.Hobbits;
import com.company.models.Observer.Orcs;
import com.company.models.Observer.Weather;
import com.company.models.Prototype.Car;
import com.company.models.Prototype.Vehicle;
import com.company.models.Proxy.MagicTower;
import com.company.models.Proxy.ProxyWizard;
import com.company.models.Proxy.WizardTowerProxy;
import com.company.models.Singleton.Categories;
import com.company.models.Singleton.IvoryTower;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Builder pattern

        Hero hero = new Hero.HeroBuilder("Superman")
                .health(100)
                .power("Super strength")
                .build();

        System.out.println(hero);

        Person person = new Person.PersonBuilder()
                .name("Faris")
                .age(13)
                .build();

        System.out.println(person);

        // DI

        Wizard wizard = new Wizard(new OldTobyTobacco());
        wizard.smoke();

        // Singleton

        var ivoryTowerOne = IvoryTower.INSTANCE;
        var ivoryTowerTwo = IvoryTower.INSTANCE;

        System.out.println(ivoryTowerOne == ivoryTowerTwo);

        Categories categoryOne = Categories.toys;
        Categories categoryTwo = Categories.toys;

        System.out.println(categoryOne == categoryTwo);

        // Adapter

        Captain captain = new Captain(new FishingBoatAdapter());

        captain.row();

        // Bridge

        Weapon axe = new Axe(new FlyingEnchantment());
        axe.wield();
        axe.swing();
        axe.unwield();

        // Proxy

        WizardTowerProxy proxy = new WizardTowerProxy(new MagicTower());
        proxy.enter(new ProxyWizard("Faris"));
        proxy.enter(new ProxyWizard("Amil"));
        proxy.enter(new ProxyWizard("Tarik"));
        proxy.enter(new ProxyWizard("Edin"));

        // Iterator

        List<Item> itemList = new ArrayList<>();
        itemList.add(new Item("Sword"));
        itemList.add(new Item("Sword"));
        itemList.add(new Item("Sword"));

        Iterator<Item> itemIterator = itemList.iterator();

        while (itemIterator.hasNext()) {
            System.out.println(itemIterator.next().getName());
        }

        // Observer

        Weather weather = new Weather();

        weather.addObservers(new Orcs());
        weather.addObservers(new Hobbits());

        weather.timePasses();
        weather.timePasses();

        // Memento

        var states = new Stack<>();
        var star = new Star(StarType.RED_GIANT, 1, 1);
        System.out.println(star);
        states.push(star.getMemento());
        star.timePasses();
        System.out.println(star);
        states.push(star.getMemento());

        star.setMemento((StarMementoInternal) states.pop());
        System.out.println(star);
        System.out.println(star.getMemento());

        // Memento

        var studentStates = new Stack<>();
        Student faris = new Student("Faris");
        studentStates.push(faris.getMemento());
        faris.passYear();
        System.out.println(faris);
        faris.setMemento((StudentMemento) studentStates.pop());
        System.out.println(faris);

        // Factory
        VeggieRestaurant veggieRestaurant = new VeggieRestaurant();
        veggieRestaurant.orderBurger();

        NotificationFactory notificationFactory = new NotificationFactory();
        Notification SMS = notificationFactory.createNotification(NotificationType.SMS);
        SMS.sendNotification();

        Coin bronzeCoin = CoinFactory.getCoin(CoinType.BRONZE);
        bronzeCoin.getDescription();
        Coin silverCoin = CoinFactory.getCoin(CoinType.GOLD);
        silverCoin.getDescription();

        // Prototype

        Vehicle ford = new Car("Ford", "Mustang", "Red", "4");
        System.out.println(ford);
        Vehicle fordClone = (Vehicle) ford.clone();
        System.out.println(fordClone);
    }
}
