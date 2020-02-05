package com.company;

import java.util.Iterator;

public interface MyList<E> extends Iterable<E> {

    public boolean add(E e);

    public void add(int index,E element);

    public void clear();

    public boolean contains(Object obj);

    public boolean equals(Object obj);

    public E get(int index);

    public E set(int index,E element);

    public int indexOf(Object obj);

    public  boolean isEmpty();

    public Iterator<E> iterator();

    public  int lastIndexOf(Object obj);

    public boolean remove(Object obj);

    public  int size();

}
