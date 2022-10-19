package study.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import study.store.service.CafeService;
import study.store.service.StoreService;

@Controller
public class StoreBeforeController {

    private StoreService storeService = new CafeService();

//    @RequestMapping("/request")
//    public String doService() {
//        storeService.serve();
//
//        return "";
//    }

}
