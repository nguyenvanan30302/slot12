package slot12;

import java.util.ArrayList;

public class News {
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    int AverageRate;
    ArrayList<Integer> rateList;

    public INews(int id, String title, String publishDate, String author, String content, int averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        AverageRate = averageRate;
        rateList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAverageRate() {
        return AverageRate;
    }

    @Override
    public void display(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
    public void calculate(){
        double total = 0;
        for(Integer i: rateList){
            total+=i;
        }
        AverageRate = total/rateList.size();
    }

    public void  inputRate(int star){
        if(star >=1 && star <= 5){
            rateList.add(star);
            calculate();
            return;
        }
    }
}
