package com.li.service;

import com.li.entity.Ebook;
import com.li.entity.EbookExample;
import com.li.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(String name) {
        EbookExample ebookExample = new EbookExample();

//        Criteria:相当于Where条件
        EbookExample.Criteria criteria = ebookExample.createCriteria();

        criteria.andNameLike("%"+name+"%");

        return ebookMapper.selectByExample(ebookExample);
    }
}
