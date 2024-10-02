public class FrontDesk {

    public void valetHS(String plateNumber) {
        new Valet(plateNumber).executeHotelService();
    }

    public void housekeepingHS(int roomNumber) {
        new HouseKeeping(roomNumber).executeHotelService();
    }

    public void cartHS(int numberOfCarts) {
        new Cart(numberOfCarts).executeHotelService();
    }
}
