package Learn_Again;
//Using An Iterator In A Class

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TuT18 implements Iterable<String> {
	final Scanner input = new Scanner(System.in);
	private LinkedList<String> WebSiteList = new LinkedList<String>();

	private class WebSiteCount implements Iterator<String> {

		private int index = 0;

		@Override
		public boolean hasNext() {
			return index < WebSiteList.size();
		}

		@Override
		public String next() {
			StringBuilder bd = new StringBuilder();
			try {
				URL link = new URL(WebSiteList.get(index));
				BufferedReader read = new BufferedReader(new InputStreamReader(link.openStream()));

				String line = null;

				while ((line = read.readLine()) != null) {
					bd.append(line).append("/n");
				}
				read.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
			index++;
			return bd.toString();
		}

		public void remove() {
			WebSiteList.remove(index);
		}

	}

	public void WebSiteList() {
		System.out.println("Enter The Site Name");
		String SiteName = input.nextLine();
		WebSiteList.add("http://www." + SiteName + ".com");

	}

	@Override
	public Iterator iterator() {
		return new WebSiteCount();
	}

}
