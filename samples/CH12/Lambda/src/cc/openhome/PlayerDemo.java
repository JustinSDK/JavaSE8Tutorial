package cc.openhome;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.List;
import static java.util.stream.Collectors.toList;

public class PlayerDemo {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player("Justin", 39),
                new Player("Monica", 36),
                new Player("Irene", 6)
        );
        players.stream()
                .filter(player -> player.getAge() > 15)
                .map(Player::getName)
                .map(String::toUpperCase)
                .collect(toList())
                .forEach(out::println);
    }
}

class Player {
    private String name;
    private Integer age;

    public Player(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }   
}