class FlightClass {
    public static void main(String[] args) {
        int income = 90_000;
        String flightClass = income >= 100_000 ? "First" : "Economy";

        System.out.println(flightClass);
    }
}
