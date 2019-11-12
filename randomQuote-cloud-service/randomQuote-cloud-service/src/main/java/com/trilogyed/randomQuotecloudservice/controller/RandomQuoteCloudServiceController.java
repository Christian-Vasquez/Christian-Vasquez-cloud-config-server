package com.trilogyed.randomQuotecloudservice.controller

@PropertySource(value = "classpath:randomQuote-cloud-service.properties")
@RestController
@RefreshScope
public class RandomQuoteCloudServiceController {

    @Value("${officialGreeting}")
    private String officialGreeting;

    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String helloCloud() {

        return officialGreeting;
    }


}