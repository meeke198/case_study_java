package pets;

import java.util.LinkedList;

public class Pet {
    private int petId;
    private int customerId;
    private int serviceId;
    private String description;

    private LinkedList<String> serviceHistory;

    public Pet (){

    }
    public Pet (int petId, int customerId, int serviceId,
                String description){
        this.petId = petId;
        this.customerId = customerId;
        this.serviceId = serviceId;
        this.description = description;

    }

    public LinkedList<String> getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(LinkedList<String> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public int getPetId(){
        return this.petId;
    }
    public int getCustomerId(){
        return this.customerId;
    }
    public int getServiceId(){
        return this.serviceId;
    }
    public String getDescription(){
        return this.description;
    }
    public void setpetId (int newPetId){
        this.petId = newPetId;
    }

    public void setCustomerId(int newCustomerId){
        this.customerId = newCustomerId;

    }
    public void setServiceId(int newServiceId){

        this.serviceId = newServiceId;
    }

    public void setDescription(String newDescription){

        this.description = newDescription;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", customerId=" + customerId +
                ", serviceId=" + serviceId +
                ", description='" + description + '\'' +
                ", serviceHistory=" + serviceHistory +
                '}';
    }
}