import java.util.HashMap;
public class Hash{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("Romeo And Juliet","A lovestruck Romeo sings the streets a serenade Laying everybody low with a love song that he made");
        trackList.put("Telegraph Road","A long time ago came a man on a track Walking thirty miles with a pack on his back");
        trackList.put("Money For Nothing","Now look at them yo-yos, that's the way you do it You play the guitar on the MTV");
        trackList.put("Walk Of Life","Here comes Johnny singing oldies, goldies Be-Bop-A-Lula, Baby What I Say");

        String name = trackList.get("Walk Of Life");
        System.out.println(name);
        for(HashMap.Entry<String, String> entry:trackList.entrySet()){
            System.out.format("%s: %s", entry.getKey(), entry.getValue());
            System.out.println();
        }
    }
}