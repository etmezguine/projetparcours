import java.awt.Image;
import java.awt.Toolkit;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Coucou toi, essaye de fetch !");
		System.out.println("Oui c'est moi, le bg et oui !!");
		
		URLConnection con = new URL("http://maps...").openConnection();
		InputStream is = con.getInputStream();
		byte bytes[] = new byte[con.getContentLength()];
		is.read(bytes);
		is.close();
		Toolkit tk = getToolKit();
		Image map = tk.createImage(bytes);
		tk.prepareImage(map, -1, -1, null);
	}

}
