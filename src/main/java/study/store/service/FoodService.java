package study.store.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class FoodService implements StoreService {

    @Override
    public void serve() {
        System.out.println("주문하신 음식이 나왔습니다.");
    }
}
