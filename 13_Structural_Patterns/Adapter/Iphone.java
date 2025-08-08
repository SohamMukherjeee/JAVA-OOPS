public class Iphone {

    private AppleCharger appleCharger;
    
    public Iphone(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

    public void ChargeIphon(){
       appleCharger.chargePhone();
    } 
}
