package com.example.codeclan.myprincesses;

import java.io.Serializable;

/**
 * Created by annalanigan on 19/12/2017.
 */

public class Princess implements Serializable {

    private String name;
    private Integer ranking;
    private String movie;
    private String image;
    private String data;

    public Princess(Integer ranking, String name, String movie, String image){
        this.ranking = ranking;
        this.name = name;
        this.movie = movie;
        this.image = image;
        this.data = "";
    }

    public String getName() {
        return name;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getMovie() {
        return movie;
    }

    public String getImage() {
        return image;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData(){
        return this.data;
    }
}
