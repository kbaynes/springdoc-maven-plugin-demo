package org.springdoc.maven.plugin.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;;

/**
 * Barebones controller to demonstrate generation of openapi.json.
 * See configuration/outputDir path in pom.xml
 */
@RestController
@RequestMapping("/rest/v1")
public class RestApiController {

    @GetMapping(path = "/health")
    @ResponseBody
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping(path = "/optionsForStyle/{styleId}")
	@ResponseBody
	public ResponseEntity<List<Map<String, Object>>> getOptionsForStyle(@PathVariable("styleId") final Integer styleId) {

		return new ResponseEntity<List<Map<String, Object>>>(new ArrayList<Map<String, Object>>(), HttpStatus.OK);
	}
}