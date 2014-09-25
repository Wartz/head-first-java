public class BeerSong {
    public static void main (String[] args) {
        String refrain1 = " bottles of beer on the wall, ";
        String refrain2 = " bottles of beer.";
        String songphrase1 = "Take one down and pass it around, ";
        String songphrase2 = " bottles of beer on the wall.";
        int beer = 99;
        
        while (beer > 0) {
            System.out.println(beer + refrain1 + beer + refrain2);
            System.out.println(songphrase1 + beer + songphrase2);
            System.out.println("");
            beer = beer - 1;
        }
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
    }
}
