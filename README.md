# Springdoc Maven Plugin Demo

A minimal project to demonstrate generation of JSON OpenAPI file via Maven build for Spring Boot project.

Run `mvn verify -DskipTests`

Verify that file `target/openapi.json` is generated.

## Thank You Springdoc!

I would just like to thank the Springdoc contrib for their work. I apprecate it! :-)

## About Springdoc Maven Plugin
The Springdoc Maven Plugin project can be found on GitHub at [https://github.com/springdoc/springdoc-openapi-maven-plugin](https://github.com/springdoc/springdoc-openapi-maven-plugin).

## About Springdoc
The Springdoc site can be found on GitHub at [https://springdoc.github.io/springdoc-openapi-demos/](https://springdoc.github.io/springdoc-openapi-demos/)

## About This Project - Jan 2020

It took me quite a bit of work to find a simple tool which could generate an openapi.json file from my SpringBoot project sources. I especially had trouble because there were no projects demonstrating this use case. Many demos contain live integrations into SpringBoot apps with Swagger UI, etc. Because of this, it was difficult to determine exactly what dependencies I needed for this simple use case. The POM shows what is necessary.

In my case, I wanted to generate the openapi.json file from source, then process that JSON file with [Spectacle](https://github.com/sourcey/spectacle), and serve a simple, attractive static site that documents the API.