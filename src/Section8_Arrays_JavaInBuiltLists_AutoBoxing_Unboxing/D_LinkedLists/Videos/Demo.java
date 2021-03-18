package Section8_Arrays_JavaInBuiltLists_AutoBoxing_Unboxing.D_LinkedLists.Videos;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<>();
        //ORDER OF APPEARANCE
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//        printList(placesToVisit);

        //ALPHABETICAL ORDER
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        addInOrder(placesToVisit, "Alice Springs");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);
        visit(placesToVisit);


    }

    // METHOD - PRINTLIST /////////////////////////////////////////////////////////////////////////////////////
    private static void printList(LinkedList<String> linkedList) {
        // Concept of iterator - Going through all entries of a linkedlist, array or arraylist

//        for (String s : linkedList) {
//            System.out.println("Now visiting " + s);
//        }

        // Equivalent of FOR EACH LOOP
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("-----------------------------");
    }

    // METHOD - ADDING IN ALPHABETICAL ORDER ////////////////////////////////////////////////////////////////////
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); // Go through all the records and compare to new element

            if (comparison == 0) { //0 means they match with entry already existing in linkedList
                //Equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;

            } else if (comparison > 0) {
                // new City should appear before this one
                // Brisbane  -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;

            }  // move on next city

        }
        System.out.println("-----------------------------");
        stringListIterator.add(newCity);
        return true;
    }

    // METHOD - VISIT /////////////////////////////////////////////////////////////////////////////////////////////
    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 -> {
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                }
                case 1 -> {
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                }
                case 2 -> {
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                }
                case 3 -> printMenu();
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("""
                0 - to quit\s
                1 - go to next city
                2 - go to previous city
                3 - print menu options""");
    }
}




