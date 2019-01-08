package rough;

public class ReadEnvProperty {
public static void main(String[] args) {
	String bname= System.getenv("BROWSER_NAME");
	System.out.println(bname);
}

}
