package customers;
import customers.Customer;
import java.util.List;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class CustomerManagement<K,V> {
    private static CustomerManagement CustomersManagement;
    public static Map<Integer, Customer> CustomersList;
    private static Scanner input = new Scanner(System.in);
    private CustomerManagement() {
        CustomersList = new HashMap<>();
        CustomersList.put(1, new Customer(1, "Luong","Gay kín",21, "21k Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456789"));
        CustomersList.put(2, new Customer(2, "Hieu","Queer",16, "21h Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456788"));
        CustomersList.put(3, new Customer(3, "Phong Xoan","Bisexual",11, "21f Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456787"));
        CustomersList.put(4, new Customer(4, "Hien","Female",32, "21e Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456786"));
        CustomersList.put(5, new Customer(5, "Vu","Male",15, "21d Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456787"));
        CustomersList.put(6, new Customer(6, "Tung",  "Male",15, "21c Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456786"));
        CustomersList.put(7, new Customer(7, "Minh",  "Queer",3, "21b Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456785"));
        CustomersList.put(8, new Customer(8, "Tran",  "Female",18, "21a Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456784"));
        CustomersList.put(9, new Customer(9, "Si Phong",  "Linh động",20, "21k Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "012345678"));
    }
    public static CustomerManagement getCustomerManagement() {
        if (CustomersManagement == null) {
            synchronized (CustomerManagement.class) {
                if (CustomersManagement == null) {
                    CustomersManagement = new CustomerManagement();
                }
            }
        }
        return CustomersManagement;
    }
//    public void addMember() {
//        System.out.println("Please enter information new member");
//        System.out.print("Enter id: ");
//        int id = input.nextInt();
//        input.nextLine();
//        checkID(id);
//
//        System.out.print("Enter name: ");
//        String name = input.nextLine();
//
//        System.out.print("Enter gender: ");
//        String gender = input.nextLine();
//
//        System.out.print("Enter position: ");
//        String position = input.nextLine();
//
//        System.out.print("Enter Department: ");
//        String department = input.nextLine();
//
//        Personnel obj = new Personnel(id, name, gender, position, department);
//        listPersonnel.put(id, obj);
//        for (Department el : DepartmentManagement.getDepartmentManagement().listDepartment) {
//            if (el.getName().equals(department)) {
//                el.setAmount(el.getAmount() + 1);
//            }
//        }
//    }

}

