package com.example.schoolmanagementsystem.configuration;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoConfig implements AbstractMongoConfiguration {

    @Override
    public MongoClient mongoClient() {
        return MongoClients.create("mongodb://localhost:27017/school_ms");
    }

    @Override
    public String getDatabaseName() {
        return "school_ms";
    }
}

