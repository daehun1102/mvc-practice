package com.demo.devfun.dao;

import java.util.List;
import java.util.Map;

public interface HomeDao {
    int getTestCount();
    List<Map<String, Object>> getRequests();
}
