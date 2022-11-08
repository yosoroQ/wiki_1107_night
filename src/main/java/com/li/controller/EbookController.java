package com.li.controller;

import com.li.entity.Ebook;
import com.li.response.CommonResp;
import com.li.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(String name){
        CommonResp<List<Ebook>> response = new CommonResp<>();
        List<Ebook> list = ebookService.list(name);
        response.setContent(list);
        return response;
    }

}
