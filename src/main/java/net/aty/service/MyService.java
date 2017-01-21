package net.aty.service;

import org.springframework.stereotype.Service;

/**
 * Created by admin on 2017/1/21.
 */
@Service
public class MyService {

    public MyService() {
        System.out.println("bean MyService");
    }

    public String process(String name) {
        return name.toLowerCase();
    }
}

