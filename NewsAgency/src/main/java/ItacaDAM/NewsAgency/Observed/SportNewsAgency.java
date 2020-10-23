package ItacaDAM.NewsAgency.Observed;

import java.util.ArrayList;
import java.util.List;

import ItacaDAM.NewsAgency.News.News;
import ItacaDAM.NewsAgency.Observers.Channel;

public class SportNewsAgency {
    private News news;
    private List<Channel> channels = new ArrayList<>();
 
    public void addObserver(Channel channel) {
        this.channels.add(channel);
    }
 
    public void removeObserver(Channel channel) {
        this.channels.remove(channel);
    }
 
    public void setNews(News news) {
        this.news = news;
        for (Channel channel : this.channels) {
            channel.update(this.news);
        }
    }
}


