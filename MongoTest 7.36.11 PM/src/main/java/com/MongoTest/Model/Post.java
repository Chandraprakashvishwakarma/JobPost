package com.MongoTest.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "JobPost")
public class Post {
    private String profile;
    private String desc;
    private String techs[];
    private int exp;

    public Post() {
    }

    @Override
    public String toString() {
        return "Post{" +
                "profile='" + profile + '\'' +
                ", des='" + desc + '\'' +
                ", techs=" + Arrays.toString(techs) +
                ", exp=" + exp +
                '}';
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getDes() {
        return desc;
    }

    public void setDes(String des) {
        this.desc = des;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
