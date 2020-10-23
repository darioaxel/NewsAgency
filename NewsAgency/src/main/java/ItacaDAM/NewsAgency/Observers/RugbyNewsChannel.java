package ItacaDAM.NewsAgency.Observers;

import ItacaDAM.NewsAgency.News.News;
import ItacaDAM.NewsAgency.News.RugbyNews;

public class RugbyNewsChannel implements Channel{

	@Override
	public void update(News n) {
		if(n instanceof RugbyNews) {
			System.out.println("Rugby Breaking News! " + n.getNews());
		}
		
	}

}
