package com.omerucel.project;

import static spark.Spark.*;

public class Server {
    public static void main(String[] args) {
        Integer port = 8080;
        if (System.getenv().containsKey("PROJECT_PORT")) {
            port = Integer.valueOf(System.getenv("PROJECT_PORT"));
        }
        port(port);
        get("/", (req, res) -> {
            return "Hello World!";
        });
    }
}
