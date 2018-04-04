package javatest;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dylan
 * 200368636
 */
public class Electronic
{
    private String make, model, category;
    private int voltage;
    private boolean hasRemote;
    
    public Electronic(String make, String model, String category, int voltage, boolean hasRemote){
        setMake(make);
        setModel(model);
        setCategory(category);
        setVoltage(voltage);
        setHasRemote(hasRemote);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if("".equals(make)){
            throw new IllegalArgumentException("The make cannot be empty.");
        }else{
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if("".equals(model)){
            throw new IllegalArgumentException("The model cannot be empty.");
        }else{
            this.model = model;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        try{
        if("receiver".equalsIgnoreCase(category)){
            this.category = category.toLowerCase();
        }else if("camera".equalsIgnoreCase(category)){
            this.category = category.toLowerCase();
        }else if("projector".equalsIgnoreCase(category)){
            this.category = category.toLowerCase();
        }else if("gaming station".equalsIgnoreCase(category)){
            this.category = category.toLowerCase();
        }else if("phone".equalsIgnoreCase(category)){
            this.category = category.toLowerCase();
        }else{
            throw new NoSuchCategoryException("Category must be receiver, camera, projector, gaming station, or phone.");
        }
            } catch (NoSuchCategoryException ex) {
                System.err.println(ex.getMessage());
            }
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        //110 OR 220
        if(voltage == 110 || voltage == 220){
            this.voltage = voltage;
        }else{
            throw new IllegalArgumentException("The voltage must be either 110 or 220");
        }
        
    }

    public boolean hasRemote() {
        return hasRemote;
    }

    public void setHasRemote(boolean hasRemote) {
        this.hasRemote = hasRemote;
    }
    
    @Override
    public String toString() {
        String rmt = "without";
        if(hasRemote){
            rmt = "with";
        }
        return make + " " + model + " running on " + voltage + " volts " + rmt + " a remote";
    }
    
    
}
