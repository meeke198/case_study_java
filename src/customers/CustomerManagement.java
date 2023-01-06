package customers;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import customers.IdGenerator;

public final class CustomerManagement<K, V> {
    private static volatile CustomerManagement departmentManagement;
    //tạo 1 biến static để lưu object duy nhất tạo ra bên trong lớp
    private static CustomerManagement CustomersManagement;
    private Map<String, Customer> CustomersList;
    private static Scanner input = new Scanner(System.in);

    //private constructor để không tạo object được từ bên ngoài lớp
    private CustomerManagement() {
        CustomersList = new HashMap<>();
        CustomersList.put("CS00120", new Customer("CS00120", "Luong", "Gay kín", 21, "21k Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456789"));
        CustomersList.put("CS00120", new Customer("CS00120", "Hieu", "Queer", 16, "21h Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456788"));
        CustomersList.put("CS00120", new Customer("CS00120", "Phong Xoan", "Bisexual", 11, "21f Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456787"));
        CustomersList.put("CS00120", new Customer("CS00120", "Hien", "Female", 32, "21e Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456786"));
        CustomersList.put("CS00120", new Customer("CS00120", "Vu", "Male", 15, "21d Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456787"));
        CustomersList.put("CS00120", new Customer("CS00120", "Tung", "Male", 15, "21c Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456786"));
        CustomersList.put("CS00120", new Customer("CS00120", "Minh", "Queer", 3, "21b Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456785"));
        CustomersList.put("CS00120", new Customer("CS00120", "Tran", "Female", 18, "21a Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "0123456784"));
        CustomersList.put("CS00120", new Customer("CS00120", "Si Phong", "Linh động", 20, "21k Nguyễn Văn Trỗi, P. 10, Phú Nhuận, Tp.HCM", "012345678"));
    }

    //    do constructor đã private rồi nên không tạo được object bên ngoài
//    nên phải tạo getCustomerManagement và new mới 1 instance phía bên trong
    //tuy nhiên nếu để public hàm này thì bên ngoài có thể gọi và tạo mới được
    //nên phải để static
    public static CustomerManagement getCustomerManagement() {

        synchronized (CustomerManagement.class) {
            if (CustomersManagement == null) {
                CustomersManagement = new CustomerManagement();
            }
        }
        return CustomersManagement;
    }

public void add(String id, Customer newCustomer){
        if(newCustomer != null){
            CustomersList.put(id, newCustomer);
        }
}
    public void remove(String id){
        CustomersList.remove(id);
    }

    public Customer searchById(String id){
          return CustomersList.get(id);
    }

    public StringBuilder searchByPhoneNumber(String phoneNumber){
        StringBuilder result = new StringBuilder("");
        for (Map.Entry<String, Customer> entry : CustomersList.entrySet()) {
            String key =  entry.getKey();
            Customer value =  entry.getValue();
            if(phoneNumber.equals(value.getPhoneNumber())){
                result.append(CustomersList.get(key).toString());
            }
        }
        return result;
    }

    public StringBuilder researchByName( String name){
        StringBuilder result = new StringBuilder("");
        for(Map.Entry<String, Customer> entry : CustomersList.entrySet()){
            String key = entry.getKey();
            Customer value = entry.getValue();
            if(name.equals(value.getName())){
                result.append(CustomersList.get(key).toString());
            }
        }
        return result;
    }

    public void editName(Customer customer, String name){
        customer.setName(name);
    }

    public void editPhoneNumber(Customer customer, String phoneNumber){
        customer.setPhoneNumber(phoneNumber);
    }

    public void edit(Customer customer, String name){
        customer.setName(name);
    }

    public void editAddress(Customer customer, String address){
        customer.setAddress(address);
    }

    public void editPetId(Customer customer, int petId){
        customer.setPetId(petId);
    }

}



