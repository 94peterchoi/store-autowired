package study.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import study.store.service.StoreService;

@Controller
public class StoreController {

//    @Autowired
//    private StoreService storeService;


    private final StoreService storeService;
    @Autowired
    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }


//    private StoreService storeService;
//    @Autowired
//    public void setStoreService(StoreService storeService) {
//        this.storeService = storeService;
//    }


//    private final StoreService cafeService;
//    private final StoreService foodService;
//
//    @Autowired
//    public StoreController(StoreService cafeService, StoreService foodService) {
//        this.cafeService = cafeService;
//        this.foodService = foodService;
//    }


    @RequestMapping("/request")
    public String doService() {

        storeService.serve();

        return "";
    }


//    @RequestMapping("/cafe")
//    public String doCafeService() {
//
//        cafeService.serve();
//
//        return "";
//    }
//
//    @RequestMapping("/food")
//    public String doFoodService() {
//
//        foodService.serve();
//
//        return "";
//    }

}
