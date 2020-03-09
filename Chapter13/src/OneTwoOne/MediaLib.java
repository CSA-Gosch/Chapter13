package OneTwoOne;

/**
 * Maintain a collection of song, movie, and book titles.
 * 
 * @author ckinnard
 * @version 3/5/16
 */
public class MediaLib
{
    public static void main(String[] args)
    {
        double totalCost = 0.0;
        double totalRating = 0;
        int numSongs = 0;
        double aveCost;
        double aveRating;
        String delimiter = "|";

        System.out.println("Welcome to your Media Library");
        // according to Billboard's greatest songs...
        Song song1 =  new Song("The Twist", 1.29, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song1.getPrice();
        totalRating = totalRating + song1.getRating();

        Song song2 =  new Song("Smooth", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song2.getPrice();
        totalRating = totalRating + song2.getRating();

        Song song3 =  new Song("Mack the Knife", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song3.getPrice();       
        totalRating = totalRating + song3.getRating();

        Song song4 =  new Song("How Do I Live", 99, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song4.getPrice();
        totalRating = totalRating + song4.getRating();

        Song song5 =  new Song("Party Rock Anthem", 1.29, 6);
        numSongs = numSongs + 1;
        totalCost = totalCost + song5.getPrice();
        totalRating = totalRating + song5.getRating();

        Song song6 =  new Song("I Gotta Feeling", .99, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song6.getPrice();
        totalRating = totalRating + song6.getRating();

        Song song7 =  new Song("Macaren", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song7.getPrice();
        totalRating = totalRating + song7.getRating();

        Song song8 =  new Song("Physical", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song8.getPrice();
        totalRating = totalRating + song8.getRating();

        Song song9 =  new Song("You Light Up My Life", 1.29, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song9.getPrice();
        totalRating = totalRating + song9.getRating();

        Song song10 =  new Song("Hey Jude", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song10.getPrice();
        totalRating = totalRating + song10.getRating();

        /**** test code is commented out
        double testVal = 109.41;
        double testResult  = testVal / 10;
        System.out.println("Testing Result:");
        System.out.println(testResult);
         *****/

        System.out.println("Number of songs:");
        System.out.println(numSongs);

        System.out.println("Total cost:");
        System.out.println(totalCost);

        aveCost = totalCost / numSongs;
        System.out.println("Average cost:");
        System.out.println(aveCost);

        aveRating = totalRating / numSongs;
        System.out.println("Average rating:");
        System.out.println(aveRating);

        Movie movie1 = new Movie();
        movie1.setTitle("Young Frankenstein");
        System.out.println(movie1.getTitle());
        movie1.setDuration(134);
        movie1.showHoursMinutes();

        System.out.println("NumSongsInLibrary "+ song10.getNumSongsInLibrary() 
            + " should equal " + numSongs);
            
//        MySong mine = new MySong();
//        System.out.println("MINE: " + mine.showSong());
        MediaFile.writeString(song1.getTitle() + delimiter + song1.getPrice());
        MediaFile.writeString(song2.getTitle() + delimiter + song2.getPrice());
        MediaFile.writeString(song3.getTitle() + delimiter + song3.getPrice());
        MediaFile.writeString(song4.getTitle() + delimiter + song4.getPrice());
        MediaFile.writeString(song5.getTitle() + delimiter + song5.getPrice());
        MediaFile.writeString(song6.getTitle() + delimiter + song6.getPrice());
        MediaFile.writeString(song7.getTitle() + delimiter + song7.getPrice());
        MediaFile.writeString(song8.getTitle() + delimiter + song8.getPrice());
        MediaFile.saveAndClose();
        String songInfo = MediaFile.readString();

        String s = MediaFile.readString();

        while (s != null)
        {
            System.out.println("From File: " + s);
            s = MediaFile.readString();
        }

    }
}