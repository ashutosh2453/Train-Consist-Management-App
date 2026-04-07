// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    public void assignCargo(String cargo) {
        try {
            // Safety rule: Rectangular cannot carry Petroleum
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment: Rectangular bogie cannot carry Petroleum");
            }

            this.cargo = cargo;
            System.out.println(type + " bogie assigned cargo: " + cargo);

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment attempt completed.\n");
        }
    }

    @Override
    public String toString() {
        return type + " -> Cargo: " + (cargo != null ? cargo : "None");
    }
}

public class TrainConsistAppUC15 {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create bogies
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Continue program
        System.out.println("Final Bogie States:");
        System.out.println(b1);
        System.out.println(b2);

        System.out.println("\nProgram continues safely...");
    }
}