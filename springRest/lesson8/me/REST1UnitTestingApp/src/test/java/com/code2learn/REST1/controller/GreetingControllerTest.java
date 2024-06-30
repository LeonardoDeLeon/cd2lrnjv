package com.code2learn.REST1.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.code2learn.REST1.service.IGreetingService;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(GreetingController.class)
public class GreetingControllerTest 
{
    @MockBean
    private IGreetingService service;

    @Autowired
    private MockMvc mockMvc; 

    @Test
    @Disabled
    public void testGenerateGreetingsUnit() throws Exception
    {
        // Mocking
        Mockito.when(service.generateSomeWish())
                .thenReturn("Good Night");

        // RequestObject
        MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders.get("/greet");
        
        ResultActions result=mockMvc.perform(reqBuilder);
    
        MvcResult mvcResult=result.andReturn();

        MockHttpServletResponse response=mvcResult.getResponse();

        int status=response.getStatus();

        assertEquals(200,status);
    }

    @Test
    public void testAcceptTouristInfoUnit() throws Exception
    {
        // Mocking
        Mockito.when(service.welcomeTourist(ArgumentMatchers.any()))
                .thenReturn(true);

        Tourist tourist = new Tourist(11,"Rohan","BL","Dia",45454.4);
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(tourist);

        // RequestObject
        MockHttpServletRequestBuilder reqBuilder=MockMvcRequestBuilders
                    .post("/tourist")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(json);
        
        ResultActions result=mockMvc.perform(reqBuilder);
    
        MvcResult mvcResult=result.andReturn();

        MockHttpServletResponse response=mvcResult.getResponse();

        int status=response.getStatus();

        assertEquals(201,status);
    }

}
