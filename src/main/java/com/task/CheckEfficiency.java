package com.task;

import java.util.ArrayList;
import java.util.LinkedList;

public class CheckEfficiency {
    static void checkEfficiency() {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        int size = 1000;
        //Add
        long elapsedArrayListAdd = getElapsedArrayListAdd(arrayList, size);
        long elapsedLinkedListAdd = getElapsedLinkedListAdd(linkedList, size);

        //Get
        long elapsedArrayListGet = getElapsedArrayListGet(arrayList, size);
        long elapsedLinkedListGet = getElapsedLinkedListGet(linkedList, size);

        //Delete
        long elapsedArrayListDelete = getElapsedArrayListDelete(arrayList, size);
        long elapsedLinkedListDelete = getElapsedLinkedListDelete(linkedList, size);

        Table.createGUI(elapsedArrayListAdd, elapsedArrayListGet, elapsedArrayListDelete, elapsedLinkedListAdd, elapsedLinkedListGet, elapsedLinkedListDelete);
    }

    /**
     * @param linkedList  the linkedList whose performance is being checked
     * @param size       how many times will the method be called
     * @return long  time of the operation
     */
    private static long getElapsedLinkedListDelete(LinkedList linkedList, int size) {
        long startLinkedListDelete = System.nanoTime();//the time of the start  of the Delete in LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.remove(0);
        }
        long finishLinkedListDelete = System.nanoTime();//the time of the end of the Delete in LinkedList
        long elapsedLinkedListDelete = finishLinkedListDelete - startLinkedListDelete;
        return elapsedLinkedListDelete;
    }

    /**
     * @param arrayList the arrayList whose performance is being checked
     * @param size      how many times will the method be called
     * @return long time of the operation
     */
    private static long getElapsedArrayListDelete(ArrayList arrayList, int size) {
        long startArrayListDelete = System.nanoTime();//the time of the start  of the Delete in ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.remove(0);
        }
        long finishArrayListDelete = System.nanoTime();//the time of the end of the Delete in ArrayList
        long elapsedArrayListDelete = finishArrayListDelete - startArrayListDelete;
        return elapsedArrayListDelete;
    }

    /**
     * @param linkedList the linkedList whose performance is being checked
     * @param size       how many times will the method be called
     * @return long time of the operation
     */
    private static long getElapsedLinkedListGet(LinkedList linkedList, int size) {
        long startLinkedListGet = System.nanoTime();//the time of the start  of the Get in LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.get(0);
        }
        long finishLinkedListGet = System.nanoTime();//the time of the end of the Get in LinkedList
        long elapsedLinkedListGet = finishLinkedListGet - startLinkedListGet;
        return elapsedLinkedListGet;
    }

    /**
     * @param arrayList the arrayList whose performance is being checked
     * @param size      how many times will the method be called
     * @return long  time of the operation
     */
    private static long getElapsedArrayListGet(ArrayList arrayList, int size) {
        long startArrayListGet = System.nanoTime();//the time of the start  of the Get in ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.get(0);
        }
        long finishArrayListGet = System.nanoTime();//the time of the end of the Get in ArrayList
        long elapsedArrayListGet = finishArrayListGet - startArrayListGet;
        return elapsedArrayListGet;
    }

    /**
     * @param linkedList the linkedList whose performance is being checked
     * @param size       how many times will the method be called
     * @return long time of the operation
     */
    private static long getElapsedLinkedListAdd(LinkedList linkedList, int size) {
        long startLinkedListAdd = System.nanoTime();//the time of the start  of the Add in LinkedList
        for (int i = 0; i < size; i++) {
            linkedList.add(0);
        }
        long finishLinkedListAdd = System.nanoTime();//the time of the end of the Add in LinkedList is detected
        long elapsedLinkedListAdd = finishLinkedListAdd - startLinkedListAdd;
        return elapsedLinkedListAdd;
    }

    /**
     * @param arrayList the arrayList whose performance is being checked
     * @param size      how many times will the method be called
     * @return long  time of the operation
     */
    private static long getElapsedArrayListAdd(ArrayList arrayList, int size) {
        long startArrayListAdd = System.nanoTime();//marking the start time of Add in ArrayList
        for (int i = 0; i < size; i++) {
            arrayList.add(0);
        }
        long finishArrayListAdd = System.nanoTime();//marking the end time of Add in ArrayList
        long elapsedArrayListAdd = finishArrayListAdd - startArrayListAdd;
        return elapsedArrayListAdd;
    }
}

