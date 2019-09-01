import java.sql.SQLOutput;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

    TreeMap <String, TreeSet < String >> map = new TreeMap<>() ;

    public  PhoneBook () {

        String [][] users = {
            {"Иванов","891976543"},
            {"Петров","891025456"},
            {"Сидоров","895213514"},
            {"Иванов","891967542"}};
        for (int i=0; i<4; i++){
        if (!map.containsKey(users[i][0])){
            TreeSet<String> set = new TreeSet<>();
            set.add(users[i][1]);
            map.put(users[i][0],set);
        }else {
            map.get(users[i][0]).add(users[i][1]);
        }
    }
        System.out.println(map);
    }

    public void add (String lastName, String numberOfPhone){
        if (!map.containsKey (lastName)){
            TreeSet<String> set = new TreeSet<>();
            set.add(numberOfPhone);
            map.put(lastName,set);
            System.out.println("Добавили пользователя!");
        }else {
            map.get(lastName).add(numberOfPhone);
            System.out.println(" Добавили пользователю телефон!" );
        }
    }

    public  void get(String lastName){
        if (!map.containsKey(lastName)) {
            System.out.println(" В справочнике нет такой фамилии");
        }else {
            System.out.println(lastName+ " имеет номер(а): " + map.get(lastName));
    }

    }
}
