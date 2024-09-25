public class FrontDesk {
    private HotelService hsvalet;
    private HotelService hshousekeeping;
    private HotelService hscart;
        
    public FrontDesk(HotelService hsvalet, HotelService hshousekeeping, HotelService hscart) {
        this.hsvalet = hsvalet;
        this.hshousekeeping = hshousekeeping;
        this.hscart =hscart;
    }


}