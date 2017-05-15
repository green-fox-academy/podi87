package com.greenfoxacademy.guardian.controller;

import com.greenfoxacademy.guardian.GuardianApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = GuardianApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testWithGivenParameters() throws Exception {
    ResultActions perform = mockMvc.perform(get("/groot")
            .param("message", "somemessage"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.received").value("somemessage"));
  }

  @Test
  public void testWithoutGivenParameters() throws Exception {
    ResultActions perform = mockMvc.perform(get("/groot"))
            .andDo(print())
            .andExpect(status().isNoContent())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error").value("I am Groot!"));
  }

  @Test
  public void testArrowWithGivenParameters() throws Exception {
    ResultActions perform = mockMvc.perform(get("/yondu")
            .param("distance", "100.0")
            .param("time", "10.0"))
            .andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.distance").value("100.0"))
            .andExpect(jsonPath("$.time").value("10.0"))
            .andExpect(jsonPath("$.speed").value("10.0"));
  }

  @Test
  public void testArrowWithoutGivenParameters() throws Exception {
    ResultActions perform = mockMvc.perform(get("/yondu"))
            .andDo(print())
            .andExpect(status().isNoContent())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
            .andExpect(jsonPath("$.error").value("I am Yondu!"));
  }
}