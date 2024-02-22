class Pumpkin {

    private boolean forHalloween;

    public Pumpkin(boolean forHalloween) {
        this.forHalloween = forHalloween;
    }

    public void addCandle() {
        if (forHalloween) {
         Candle candle  = new Candle();
        candle.burning();
//          forHalloween = false;
        } else {
            System.out.println("We don't need a candle.");
        }
    }

    class Candle {

        void burning() {
            System.out.println("The candle is burning! Boooooo!");
        }
    }

    public static void main(String[] args) {
        Pumpkin pumpkin = new Pumpkin(false);
        pumpkin.addCandle();

    }
}
