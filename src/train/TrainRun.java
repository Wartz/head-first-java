class TrainRun {
    public static void main (String[] args) {
        Train SteamTrain = new Train();
        SteamTrain.model = "Steam";
        SteamTrain.topSpeed = 120;
        SteamTrain.cars = 35;
        
        SteamTrain.move();
    }
}