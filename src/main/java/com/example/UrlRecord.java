package com.example;


import com.example.DTO.UrlDTO;
import com.example.DTO.UrlStatDTO;

import javax.persistence.*;
import java.util.Date;

@Entity

public class UrlRecord {

    @Id
    @GeneratedValue
    private  Long id;

    @Column(nullable = false)
    private  String url; //long Url

    @Column(nullable = false)
    private Long count;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date lastAccess;


    public UrlRecord() {
        count=0L;
        lastAccess=new Date();
    }

    public UrlRecord(String url) {
        this();
        this.url = url;

    }

    public static UrlRecord of(UrlDTO urlDTO) {

        return  new UrlRecord(urlDTO.getUrl());
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public UrlStatDTO toStatDTO() {
        var result = new UrlStatDTO();

        result.setUrl(url);
        result.setShortUrl(Long.toString(id));
        result.setRedirects(count);
        result.setLastAccess(lastAccess);

        return result;
    }
}
