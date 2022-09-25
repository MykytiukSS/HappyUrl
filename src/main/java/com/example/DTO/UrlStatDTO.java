package com.example.DTO;

import java.util.Date;

public class UrlStatDTO extends UrlResultDTO {
private  long redirects;
public Date lastAccess;  //TODO :set normal format

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public long getRedirects() {
        return redirects;

    }

    public void setRedirects(long redirects) {
        this.redirects = redirects;
    }
}
