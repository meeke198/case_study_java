package pets;

import java.util.LinkedList;

public class Pet {
    private String petId;
    private String name;
    private String ownerId;
    private String serviceId;
    private String description;

    private LinkedList<String> serviceHistory;

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public Pet (){

    }
    public Pet (String petId, String ownerId, String serviceId,
                String description){
        this.petId = petId;
        this.ownerId = ownerId;
        this.serviceId = serviceId;
        this.description = description;

    }

    public LinkedList<String> getServiceHistory() {
        return serviceHistory;
    }

    public void setServiceHistory(LinkedList<String> serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public String getPetId(){
        return this.petId;
    }
    public String getCustomerId(){
        return this.ownerId;
    }
    public String getServiceId(){
        return this.serviceId;
    }
    public String getDescription(){
        return this.description;
    }
    public void setpetId (String newPetId){
        this.petId = newPetId;
    }

    public void setCustomerId(String newCustomerId){
        this.ownerId = newCustomerId;

    }
    public void setServiceId(String newServiceId){

        this.serviceId = newServiceId;
    }

    public void setDescription(String newDescription){

        this.description = newDescription;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petId=" + petId +
                ", name='" + name + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", serviceId=" + serviceId +
                ", description='" + description + '\'' +
                ", serviceHistory=" + serviceHistory +
                '}';
    }
}