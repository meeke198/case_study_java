package pets;
import customers.Customer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public final class PetManagement<K, V> {
private static volatile PetManagement departmentManagement;
private static PetManagement petManagement;
private Map<String, Pet> PetList;
//    public int generateId() {
//        Integer min = 1; // Giá trị nhỏ nhất
//        Integer max = 1000; // Giá trị lớn nhất
//
//        Integer randomNumber = min + (int)(Math.random() * ((max - min) + 1));
////        while (PetList.containsKey(randomNumber)){
////            randomNumber = min + (int)(Math.random() * ((max - min) + 1));
////        }
//        return randomNumber;
//    }
private static Scanner input = new Scanner(System.in);
    private PetManagement() {
        PetList = new HashMap<>();
        PetList.put("CS00120", new Pet("CS00120", "CS00120", "CS00120", "This dog need shredding"));
    }
}
