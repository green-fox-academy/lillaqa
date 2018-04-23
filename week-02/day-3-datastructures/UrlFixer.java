public class UrlFixer {

    public static void main(String[] args) {

        String url = "https//www.reddit.com/r/nevertellmethebots";


        System.out.println(url);
        
        String goodUrl = url.replace("https", "https:");
        String finalUrl = goodUrl.replace("bots", "odds");
        System.out.println(finalUrl);
    }
}
