package Manger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    public static void main(String[] args) {
        List list = new ArrayList();
        Customer customer1 = new Customer("lwd", "123");
        Customer customer2 = new Customer("dsb", "443");
        list.add(customer1);
        list.add(customer2);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        Map<String,Customer> map1 = new HashMap<>();
        map1.put("001",customer1);
        System.out.println(map1.get("001").toString());
    }
}