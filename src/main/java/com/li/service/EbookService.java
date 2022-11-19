package com.li.service;

import com.li.entity.Ebook;
import com.li.entity.EbookExample;
import com.li.mapper.EbookMapper;
import com.li.request.EbookReq;
import com.li.response.EbookResp;
import com.li.utils.CopyUtil;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;


@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        if (!ObjectUtils.isEmpty(req.getName())) {
            criteria.andNameLike("%" + req.getName() + "%");
        }
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        // 列表复制
        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);

        return list;
    }

}