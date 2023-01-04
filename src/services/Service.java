package services;

public class Service {
    private int serviceId;
    private String serviceName;
    private float price;
    private String description;
    public Service(){

    }
    public Service (int service_id, String service_name,
                    Float price, String description){
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getServiceId(){
        return this.serviceId;
    }
    public String getServiceName(){
        return this.serviceName;
    }
    public float getPrice(){
        return this.price;
    }
    public void setServiceId(int newServiceId){
        this.serviceId = newServiceId;
    }

    public void setServiceName(String newServiceName){
        this.serviceName = newServiceName;

    }
    public void setPrice(float newPrice){
        this.price = newPrice;
    }

}

