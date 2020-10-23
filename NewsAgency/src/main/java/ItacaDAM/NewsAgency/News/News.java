package ItacaDAM.NewsAgency.News;

public abstract class News {
	protected String news;
	
	public News(String news) {
		this.news = news;
	}

	public String getNews() {
		return news;
	}
}
