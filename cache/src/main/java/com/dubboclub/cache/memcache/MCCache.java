package com.dubboclub.cache.memcache;

import com.alibaba.dubbo.cache.Cache;
import com.alibaba.dubbo.common.URL;
import com.dubboclub.cache.AbstractCache;

/**
 * Created by bieber on 2015/5/26.
 */
public class MCCache extends AbstractCache {
    
    public MCCache(String cacheName, URL url) {
        super(cacheName, url);
    }

    @Override
    public void put(Object o, Object o1) {

    }

    @Override
    public Object get(Object o) {
        return null;
    }
}
