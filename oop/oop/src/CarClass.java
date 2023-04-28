class CarClass {
    public static void main(String[] args) {
        //contoh pembuatan class
        class Car {
            String merk;
            String model;
            final String country = "Indonesia";

            void startEngine(String merk, String model){
                System.out.println(merk + " " + model + " Engine Started!");
            };
            String stopEngine(String merk, String model){
                return merk + " " + model + " engine stopped!";
            }
        }

        //contoh pembuatan object
        var car = new Car();
        Car car2;
        car2 = new Car();

        new Car().startEngine("Honda", "Mobilio");
        car.startEngine("Honda", "Jazz");
        car2.startEngine("Toyota", "Avanza");

        System.out.println(car2.stopEngine("Daihatsu", "Xenia"));
    }
}
