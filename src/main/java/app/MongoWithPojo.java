package app;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class MongoWithPojo {

    public static void main(String[] args) {

        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClient mongoClient = new MongoClient("localhost", MongoClientOptions.builder().codecRegistry(pojoCodecRegistry).build());

        MongoDatabase mongoDatabase = mongoClient.getDatabase("Food");
        MongoCollection mongoCollection = mongoDatabase.getCollection("Drink", Drink.class);

        Drink drink = new Drink();
        drink.setName("Tea");
        drink.setPrice(1.8);
        mongoCollection.insertOne(drink);

        Drink getDring  = (Drink)mongoCollection.find().first();
        System.out.println(drink);

    }
}
