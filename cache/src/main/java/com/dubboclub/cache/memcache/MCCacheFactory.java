package com.dubboclub.cache.memcache;

import com.alibaba.dubbo.cache.Cache;
import com.alibaba.dubbo.cache.CacheFactory;
import com.alibaba.dubbo.common.URL;
import com.dubboclub.cache.AbstractCacheFactory;

/**
 * Created by bieber on 2015/5/26.
 */
public class MCCacheFactory extends AbstractCacheFactory {

    @Override
    protected Cache generateNewCache(String cacheName, URL url) {
        return new MCCache(cacheName,url);
    }
}
