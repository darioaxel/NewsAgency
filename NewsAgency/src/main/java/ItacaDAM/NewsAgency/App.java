package ItacaDAM.NewsAgency;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import ItacaDAM.NewsAgency.News.FootballNews;
import ItacaDAM.NewsAgency.News.HandballNews;
import ItacaDAM.NewsAgency.News.News;
import ItacaDAM.NewsAgency.News.RugbyNews;
import ItacaDAM.NewsAgency.Observed.SportNewsAgency;
import ItacaDAM.NewsAgency.Observers.Channel;
import ItacaDAM.NewsAgency.Observers.FootballNewsChannel;
import ItacaDAM.NewsAgency.Observers.HandballNewsChannel;
import ItacaDAM.NewsAgency.Observers.RugbyNewsChannel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {     
    	SportNewsAgency liveSports = new SportNewsAgency();
    	
    	Channel rugbyWorld = new RugbyNewsChannel();
    	Channel laLiga = new FootballNewsChannel();
    	Channel SevenMeters = new HandballNewsChannel();
    	
    	liveSports.addObserver(rugbyWorld);
    	liveSports.addObserver(laLiga);
    	liveSports.addObserver(SevenMeters);
    	
    	List<News> breakingNews = newsCreator(5);
    	for(News n: breakingNews) {
    		liveSports.setNews(n);
    	}
    }   
    
    public static List<News> newsCreator(int n) {
    	List news = new ArrayList();
    	
    	for(int i= 0; i<n ; i++) {
    		 Random random = new Random();
    		    switch( random.ints(0, 2)
    		      .findFirst()
    		      .getAsInt()) {
    		    case 0: news.add(new FootballNews("Football match ended!"));
    		    	break;
    		    case 1: news.add(new RugbyNews("Great Try!"));
    		    	break;
    		    case 2: news.add(new HandballNews("2 minutes and 7 meters for the team!"));
    		    	break;
    		    };
    	}
    	
    	return news;
    }
    
}
