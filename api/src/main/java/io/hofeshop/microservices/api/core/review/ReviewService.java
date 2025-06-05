package io.hofeshop.microservices.api.core.review;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ReviewService {

    @GetMapping("/review")
    List<Review> getReviews(@RequestParam int productId);
}
