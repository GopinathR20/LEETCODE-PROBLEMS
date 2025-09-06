public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        StringBuilder a=new StringBuilder();
        for(char c:longUrl.toCharArray()){
            a.append((char)(c+1));
        }
        return a.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    StringBuilder a=new StringBuilder();
        for(char c:shortUrl.toCharArray()){
            a.append((char)(c-1));
        }
        return a.toString();
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));