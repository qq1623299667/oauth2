package com.example.oauth2core.validate.core;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

@Data
public class ImageCode {
    private BufferedImage image;// 图片
    private String code;
    private LocalDateTime expireTime;
    public ImageCode(BufferedImage image,String code,LocalDateTime expireTime){
        this.image = image;
        this.code = code;
        this.expireTime = expireTime;
    }
    public ImageCode(BufferedImage image,String code,int expireIn){
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }
}
