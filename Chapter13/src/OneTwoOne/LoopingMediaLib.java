package OneTwoOne;

public class LoopingMediaLib {

    public static void main(String[] args) {
        String s = MediaFile.readString();

//        while (s != null) {
//            System.out.println("From File: " + s);
//            s = MediaFile.readString();
//        }
//        while (s != null)
//        {
//            String title = s.substring(0, s.indexOf("|"));
//            String rating = s.substring(s.indexOf("|") + 1, s.length());
//            System.out.println("Title: " + title + "\nRating: " + rating);
//            s = MediaFile.readString();
//
//        }
        while(s != null)
        {
            int rating = Integer.parseInt( s.substring(s.indexOf("|") + 1, s.length()));
            String title = s.substring(0, s.indexOf("|"));
            if(rating >= 9)
            {
                System.out.println("Favorite Song\nTitle: " + title + "\nRating: " + rating);
            }
            s = MediaFile.readString();
        }
    }
}
