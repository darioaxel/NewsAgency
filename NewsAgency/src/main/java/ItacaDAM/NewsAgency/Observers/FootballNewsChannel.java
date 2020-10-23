package ItacaDAM.NewsAgency.Observers;

import ItacaDAM.NewsAgency.News.FootballNews;
import ItacaDAM.NewsAgency.News.News;

public class FootballNewsChannel implements Channel {

	@Override
	public void update(News n) {
		if(n instanceof FootballNews) {
			System.out.println("Football Breaking News! " + n.getNews());
		}
		
	}

}
