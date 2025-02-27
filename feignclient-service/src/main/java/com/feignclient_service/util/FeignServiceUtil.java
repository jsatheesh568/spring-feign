package com.feignclient_service.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Feign client interface to communicate with the Demo Service.
 * <p>
 * This interface defines the REST endpoints that Feign will consume.
 *
 * @author Satheeshkumar Subramanian
 */
@FeignClient ( value = "feignDemo", url = "http://localhost:8084/api/v1/user/" )
public interface FeignServiceUtil {

    /**
     * Fetches the user's name from the Demo Service.
     *
     * @return Name of the user.
     */
    @GetMapping ( "/name" )
    String getName ( );

    /**
     * Fetches the user's address from the Demo Service.
     *
     * @return Address of the user.
     */
    @GetMapping ( "/address" )
    String getAddress ( );

    /**
     * Fetches the user's status from the Demo Service.
     *
     * @return Status of the user.
     */
    @GetMapping ( "/status" )
    String getStatus ( );
}
