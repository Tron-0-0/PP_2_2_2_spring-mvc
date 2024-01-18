package web.models;

public class Car {
    private String model;
    private Integer serialNumber;
    private Integer year;

    public Car(String model, Integer serialNumber, Integer year) {
        this.model = model;
        this.serialNumber = serialNumber;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", serialNumber=" + serialNumber +
                ", year=" + year +
                '}';
    }
}
