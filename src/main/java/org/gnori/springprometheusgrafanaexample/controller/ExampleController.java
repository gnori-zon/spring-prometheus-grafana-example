package org.gnori.springprometheusgrafanaexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

  @GetMapping("/example")
  public String greeting(@RequestParam(name = "name", required = false, defaultValue = "unnamed") String name) {
    return "example: " + name;
  }
}
