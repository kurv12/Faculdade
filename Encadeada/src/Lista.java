/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 201819070174
 */
public interface Lista {

    Object get(int pos);

    boolean add(int pos, Object item);

    boolean add(Object item);

    boolean remove(int pos);

    boolean isEmpty();

    int size();
}
