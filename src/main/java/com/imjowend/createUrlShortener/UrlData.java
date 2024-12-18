package com.imjowend.createUrlShortener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class UrlData {

    private String originalUrl;
    private long expirationTime;

}
