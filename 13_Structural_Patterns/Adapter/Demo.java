class Demo{
    public static void main(String[] args) {
        System.out.println("Start");
        AppleCharger charger=new AdapterCharger(new DkCharger());
        Iphone iphone=new Iphone(charger);
        iphone.ChargeIphon();
    }
}