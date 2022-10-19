package study.store.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CafeService implements StoreService{

    @Override
    public void serve() {
        System.out.println("주문하신 음료 나왔습니다.");
    }
}
