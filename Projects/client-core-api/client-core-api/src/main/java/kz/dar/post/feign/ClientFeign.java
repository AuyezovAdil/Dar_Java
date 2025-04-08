package kz.dar.post.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient ("post-core-api")
public interface ClientFeign {

    @GetMapping ("/post/check")
    String checkPost();

}
