package com.li.controller;

import com.li.request.EbookReq;
import com.li.response.CommonResp;
import com.li.response.EbookResp;
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
    public CommonResp list(EbookReq req){
        CommonResp<List<EbookResp>> response = new CommonResp<>();
        List<EbookResp> list = ebookService.list(req);
        response.setContent(list);
        return response;
    }

}
