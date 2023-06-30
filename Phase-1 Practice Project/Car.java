package Task;

public class Car {
	    private String brand;
	    private String model;
	    private int year;

	    // Constructor with parameters
	    public Car(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    // Getter methods
	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }	

	    public int getYear() {
	        return year;
	    }

	    public static void main(String[] args) {
	        // Creating objects of Car class using constructors
	        Car car1 = new Car("Tata", "Nexon", 2022);
	        Car car2 = new Car("Mahindra", "Bolero", 2023);

	        // Accessing object properties using getter methods
	        System.out.println("Car 1:");
	        System.out.println("Brand: " + car1.getBrand());
	        System.out.println("Model: " + car1.getModel());
	        System.out.println("Year: " + car1.getYear());

	        System.out.println();

	        System.out.println("Car 2:");
	        System.out.println("Brand: " + car2.getBrand());
	        System.out.println("Model: " + car2.getModel());
	        System.out.println("Year: " + car2.getYear());
	    }
	}





