package com.junittesting.testinglistoperations;

import java.util.List;

//Handles basic List operations
public class ListManager {

 // Adds an element to the list
 public void addElement(List<Integer> list, int element) {
     list.add(element);
 }

 // Removes an element from the list
 public void removeElement(List<Integer> list, int element) {
     list.remove(Integer.valueOf(element));
 }

 // Returns size of the list
 public int getSize(List<Integer> list) {
     return list.size();
 }
}
