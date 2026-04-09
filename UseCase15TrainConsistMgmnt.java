// UC15: Safe Cargo Assignment Using try-catch-finally

import java.util.Scanner;

public class UseCase15TrainConsistMgmnt
{
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String shape;
        private String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo)
        {
            try {
                if (cargo.equals("Chemicals") || cargo.equals("Coal")) {
                    throw new CargoSafetyException("Unsafe cargo: " + cargo);
                }
                this.cargo = cargo;
            }
            catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println("Cargo assignment attempted for: " + cargo);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoodsBogie bogie1 = new GoodsBogie("Box");
        GoodsBogie bogie2 = new GoodsBogie("Flat");

        System.out.print("Enter cargo for Bogie 1: ");
        String cargo1 = scanner.nextLine();
        bogie1.assignCargo(cargo1);

        System.out.print("Enter cargo for Bogie 2: ");
        String cargo2 = scanner.nextLine();
        bogie2.assignCargo(cargo2);

        scanner.close();
    }
}