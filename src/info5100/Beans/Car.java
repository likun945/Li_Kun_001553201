/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.Beans;

import info5100.Beans.ServiceRecord;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String color;
    private String year;
    private String engineNo;
    private int seatsNumber;
    private String licensePlates;
    private String ownerName;
    private String ownerTelephoneNumber;
    private String ownerEmailAddress;
    private String ownerDriverLicense;
    private int ownerSocialSecurityNumber;
    private String ownerAddress;
    private ArrayList<ServiceRecord> serviceRecord;
    private String warrantyYear;
    private String photo; // picture address
//    private Owner owner;

    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public void setSeatsNumber(int seatsNumber) {
        this.seatsNumber = seatsNumber;
    }

    public String getLicensePlates() {
        return licensePlates;
    }

    public void setLicensePlates(String licensePlates) {
        this.licensePlates = licensePlates;
    }

    public ArrayList<ServiceRecord> getServiceRecord() {
        return serviceRecord;
    }

    public void setServiceRecord(ArrayList<ServiceRecord> serviceRecord) {
        this.serviceRecord = serviceRecord;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getOwnerTelephoneNumber() {
        return ownerTelephoneNumber;
    }

    public void setOwnerTelephoneNumber(String ownerTelephoneNumber) {
        this.ownerTelephoneNumber = ownerTelephoneNumber;
    }

    public String getOwnerEmail() {
        return ownerEmailAddress;
    }

    public void setOwnerEmail(String ownerEmail) {
        this.ownerEmailAddress = ownerEmail;
    }

    public String getOwnerDriverLicense() {
        return ownerDriverLicense;
    }

    public void setOwnerDriverLicense(String ownerDriverLicense) {
        this.ownerDriverLicense = ownerDriverLicense;
    }

    public int getOwnerSocialSecurityNumber() {
        return ownerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(int ownerSocialSecurityNumber) {
        this.ownerSocialSecurityNumber = ownerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return ownerAddress;
    }

    public void setOwnerAddress(String ownerAddress) {
        this.ownerAddress = ownerAddress;
    }
}
