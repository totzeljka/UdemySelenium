import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.xml.stream.util.EventReaderDelegate;

public class ReadProperties {

	public static void main(String[] args) {

		//trebalo bi da mi ispise one linkove sa confog fajla
		
		//class loader
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		InputStream propstream=	loader.getResourceAsStream("config.properties");
		Properties prop= new Properties();
		try {
			prop.load(propstream);
			System.out.println(prop.getProperty("qaurl"));
			System.out.println(prop.getProperty("devurl"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
