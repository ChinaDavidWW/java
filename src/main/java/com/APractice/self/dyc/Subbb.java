package com.APractice.self.dyc;

import com.alibaba.fastjson.JSON;

import java.util.Set;

public class Subbb {
    private Set<String> ids;

    public Set<String> getIds() {
        return ids;
    }

    public void setIds(Set<String> ids) {
        this.ids = ids;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
