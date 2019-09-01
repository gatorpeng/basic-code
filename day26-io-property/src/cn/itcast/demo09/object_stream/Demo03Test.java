package cn.itcast.demo09.object_stream;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person(19,"Scarlett Johanson"));
        list.add(new Person(29,"Leonardo Dicapcio"));
        list.add(new Person(40,"Julia Roberts"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day26-io-property//list.txt"));
        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day26-io-property//list.txt"));
        Object object = ois.readObject();

        ArrayList<Person> list02 = (ArrayList<Person>) object;


        for(Iterator<Person> iterator = list02.iterator();iterator.hasNext();){
            System.out.println(iterator.next());

        }
        ois.close();
        oos.close();


    }
}
