package com.bf.backend.service.record;

import com.alibaba.fastjson.JSONObject;

public interface GetRecordListService {
    JSONObject getList(Integer page);
}
