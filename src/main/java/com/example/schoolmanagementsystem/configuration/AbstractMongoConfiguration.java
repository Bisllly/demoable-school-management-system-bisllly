package com.example.schoolmanagementsystem.configuration;

import com.mongodb.client.MongoClient;

public interface AbstractMongoConfiguration {

    MongoClient mongoClient();

    String getDatabaseName();
}
