public class MainPhoneBook {
    public static void main(String[] args) {


        PhoneBook phoneBook = new PhoneBook();


        phoneBook.add("Васечкин", "891068456");
        phoneBook.add("Васечкин", "891095156");
        phoneBook.add("Пупкин", "893568456");
        phoneBook.add("Львов", "891093186");


        phoneBook.get("Васечкин" ) ;
        phoneBook.get("Сидоров" );
        phoneBook.get("Пупкин" );
    }
}
