package com.packt.patterninspring.chapter11.reactivewebapp;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.reactive.function.client.WebClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReactiveWebApplicationTests {

	private WebClient webClient;
	 
    @LocalServerPort
    private int port;
 
    @Before
    public void setup() {
        this.webClient = WebClient.create("http://localhost:" + this.port);
    }
 
    /*@Test
    public void getAccounts() {
        Account customer = this.webClient.get().uri("/customer/accounts/234543647565")
                .accept(MediaType.APPLICATION_JSON).exchange().then(response -> response.bodyToMono(Account.class))
                .block();
    }
 
    @Test
    public void addAccount() {
    	Account customer = new Account(5000l, "Alex", 30000l, "New Jersy");
        customer = webClient.post().uri("/customer").accept(MediaType.APPLICATION_JSON)
                .exchange().thenMany(response -> response.bodyToMono(Account.class))
                .blockFirst();
    }*/

}
