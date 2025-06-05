package io.hofeshop.microservices.api.core.recommendation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface RecommendationService {

    @GetMapping("/recommendation")
    List<Recommendation> getRecommendations(@RequestParam int productId);
}
