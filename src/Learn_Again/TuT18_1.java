package Learn_Again;

public class TuT18_1 {
	public static void main(String[] args) {
		TuT18 test = new TuT18();
		test.WebSiteList();
		for (String html : test) {
			System.out.println(html.length());
			System.out.println(html);

		}
	}
}
