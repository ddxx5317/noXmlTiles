package com.ddxx.springmvc.contoller.test;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.ddxx.springmvc.controller.HomeController;

public class HomeControlerTest {

	@Test
	public void testHomePage() throws Exception{
		HomeController controller = new HomeController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();  
		mockMvc.perform(MockMvcRequestBuilders.get("/"))  
	            .andExpect(MockMvcResultMatchers.view().name("home"));  
		
/*		mockMvc.perform(MockMvcRequestBuilders.get("/"))  
        .andExpect(MockMvcResultMatchers.view().name("home"))  
        .andExpect(MockMvcResultMatchers.model().attributeExists("user"))  
        .andDo(MockMvcResultHandlers.print())  
        .andReturn();  */
	}
}
