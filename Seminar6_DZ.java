/*Разработать программу, имитирующую поведение коллекции HashSet. 
В программе содать метод add добавляющий элемент, и метод позволяющий выводить эллементы коллекции в консоль. 
Формат данных Integer.*/


import java.util.HashMap;   
public class Seminar6_DZ {
    private static HashMap<Integer,Object> hm  = new HashMap<>();
    private static final Object OBJ = new Object();    
    public static void main(String[] args) {
        add(70);
        add(70);
        add(70);
        add(6);
        add(32);
        add(54);
        add(40);   
        System.out.println(getStr());   
    }
    private static String getStr() {
        return hm.keySet().toString();
    }
    private static void add(Integer num) {
        hm.put(num, OBJ);
    }    
}