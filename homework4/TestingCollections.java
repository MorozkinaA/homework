package homework4;
import java.util.*;

public class TestingCollections {
    public static void main(String[] args) {
        //test arrayList and LinkedList
        ArrayList<Integer> aList = new ArrayList<>();
        LinkedList<Integer> lList = new LinkedList<>();

        //test adding
        long start1 = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            aList.add(i);
        }
        System.out.println("Time of adding elements in ArrayList: " + (System.nanoTime() - start1));
        long start2 = System.nanoTime();
        for(int i = 0; i < 100000; i++) {
            lList.add(i);
        }
        System.out.println("Time of adding elements in LinkedList: " + (System.nanoTime() - start2));

        //test searching an element
        System.out.println();
        long start7 = System.nanoTime();
        aList.add(5000, 4);
        System.out.println("Time of adding ONE element by index in ArrayList: " + (System.nanoTime() - start7));
        long start8 = System.nanoTime();
        lList.add(5000, 4);
        System.out.println("Time of adding ONE elements by index in LinkedList: " + (System.nanoTime() - start8));

        //test searching an element
        System.out.println();
        long start3 = System.nanoTime();
        aList.get(7777);
        System.out.println("Time of getting element from ArrayList: " + (System.nanoTime() - start3));
        long start4 = System.nanoTime();
        lList.get(7777);
        System.out.println("Time of getting element from LinkedList: " + (System.nanoTime() - start4));

        //test removing an element
        System.out.println();
        long start5 = System.nanoTime();
        aList.remove(5555);
        System.out.println("Time of removing elements from ArrayList: " + (System.nanoTime() - start5));
        long start6 = System.nanoTime();
        lList.remove(5555);
        System.out.println("Time of removing elements from LinkedList: " + (System.nanoTime() - start6));
        System.out.println();

        //testing HashSet, LinkedHashSet, TreeSet
        HashSet<String> hSet = new HashSet<>();
        LinkedHashSet<String> lSet = new LinkedHashSet<>();
        TreeSet<String> tSet = new TreeSet<>();

        //test add elements
        long start10 = System.nanoTime();
        for( int i = 0; i < 10; i++) {
            hSet.add("set" + i);
        }
        System.out.println("Time of adding elements in HashSet: " + (System.nanoTime() - start10));

        long start11 = System.nanoTime();
        for( int i = 0; i < 10; i++) {
            lSet.add("set" + i);
        }
        System.out.println("Time of adding elements in LinkedHashSet: " + (System.nanoTime() - start11));

        long start12 = System.nanoTime();
        for( int i = 0; i < 10; i++) {
            tSet.add("set" + i);
        }
        System.out.println("Time of adding elements in TreeSet: " + (System.nanoTime() - start12));
        System.out.println();


        //test removing elements
        long start14 = System.nanoTime();
        hSet.remove("set7777");
        System.out.println("Time of removing element from HashSet: " + (System.nanoTime() - start14));

        long start15 = System.nanoTime();
        lSet.remove("set7777");
        System.out.println("Time of removing element from LinkedHashSet: " + (System.nanoTime() - start15));

        long start16 = System.nanoTime();
        tSet.remove("set7777");
        System.out.println("Time of removing element from TreeSet: " + (System.nanoTime() - start16));
        System.out.println();



        //testing HashMap, LinkedHashMap, TreeMap
        HashMap<String, Integer> hMap = new HashMap<>();
        LinkedHashMap<String, Integer> lMap = new LinkedHashMap<>();
        TreeMap<String, Integer> tMap = new TreeMap<>();

        //test add elements
        long start20 = System.nanoTime();
        for( int i = 0; i < 10; i++) {
            hMap.put("map" + i, i);
        }
        System.out.println("Time of adding elements in HashMap: " + (System.nanoTime() - start20));

        long start21 = System.nanoTime();
        for( int i = 0; i < 10; i++) {
            lMap.put("map" + i, i);
        }
        System.out.println("Time of adding elements in LinkedHashMap: " + (System.nanoTime() - start21));

        long start22 = System.nanoTime();
        for( int i = 0; i < 10; i++) {
            tMap.put("map" + i, i);
        }
        System.out.println("Time of adding elements in TreeMap: " + (System.nanoTime() - start22));
        System.out.println();


        //test removing element from Map
        long start24 = System.nanoTime();
        hMap.remove("map7777");
        System.out.println("Time of removing element from HashMap: " + (System.nanoTime() - start24));

        long start25 = System.nanoTime();
        lMap.remove("map7777");
        System.out.println("Time of removing element from LinkedHashMap: " + (System.nanoTime() - start25));

        long start26 = System.nanoTime();
        tMap.remove("map7777");
        System.out.println("Time of removing element from TreeMap: " + (System.nanoTime() - start26));
        System.out.println();

        //test getting element from Map
        long start27 = System.nanoTime();
        hMap.get("map7777");
        System.out.println("Time of getting element from HashMap: " + (System.nanoTime() - start27));

        long start28 = System.nanoTime();
        lMap.get("map7777");
        System.out.println("Time of getting element from LinkedHashMap: " + (System.nanoTime() - start28));

        long start29 = System.nanoTime();
        tMap.get("map7777");
        System.out.println("Time of getting element from TreeMap: " + (System.nanoTime() - start29));
        System.out.println();


        /*
        - обычное добавление элементов в конец ArrayList происходит быстрее, чем в конец Linked List,
        так как в ArrayList добавление происходит за константное время.

        -добавление элемента в середину списка примерно одинаковое.
        С увеличением индекса элемента время добавления элемента увеличивается у LinkedList
        (потому что приходится последовательно проходить больше элементов) и уменьшается у ArrayList

        - получить/удалить элемент по индексу в ArrayList гораздо быстрее,
        так как этот лист основан на массиве и доступ происходит по индексу в массиве.
        В LinkedList эта операция происходит медленнее, так как сначала происходит
         последовательный поиск элемент по листу, а потом уже получение/удаление значения

         -отсюда следует, что Linked List проигрывает по времени почти во всех операциях,
         однако его предпочтительно использовать для добавления элементов в середину листа.

         - Set - это множество неповторяющихся элементов.
         HashSet работает быстрее(иногда гораздо быстрее),
         чем TreeSet(набор упорядоченных элементов), поэтому предпочтительно использовать HashSet,
          если работаем с неупорядоченными элементами

          - LinkedHashSet представляет собой упорядоченное по порядку вставки множество,
           поэтому оно более быстродейственное в операциях, связанных c порядком итерации

           -Map представляет собой "словарь" с набором значений ключ-значение.
           HashMap работает также быстрее, чем TreeMap, если не требуется упорядочить элементы

           -LinkedHashMap также более быстродейственная коллекция в операциях,связанных с порядком итерации
         */
    }
}
