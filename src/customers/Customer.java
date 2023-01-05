package customers;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import customers.IdGenerator;

public class Customer {
    private String id;
    private String gender;
    private int petId;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    public Customer (){

    }
//    public Customer(String id){
//        this.id = id;
//    }

    public Customer (String id, String name, String gender, int age,
                     String address, String phoneNumber){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;

    }
    public void setAge(byte newAge){
        this.age = newAge;
    }
    public void setPhoneNumber(String newPhoneNumber){

        this.phoneNumber = newPhoneNumber;
    }
    public void addPetId(int newPetId){
        this.petId = newPetId;
    }
//    public List<Date> getDate() {
//        return attendance;
//    }
//
//    public void checkin(){
//        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
//        this.attendance.add(new Date());
//    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", petId=" + petId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }


}
