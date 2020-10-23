package ItacaDAM.NewsAgency.Observers;

import ItacaDAM.NewsAgency.News.HandballNews;
import ItacaDAM.NewsAgency.News.News;

public class HandballNewsChannel implements Channel{

	@Override
	public void update(News n) {
		if(n instanceof HandballNews) {
			System.out.println("Handball Breaking News! " + n.getNews());
		}		
	}
}
