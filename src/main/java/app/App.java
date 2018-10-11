package app;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        MongoClient mongoClient = new MongoClient("localhost", 27017);
        MongoDatabase mongoDatabase = mongoClient.getDatabase("Toys");
        MongoCollection mongoCollection = mongoDatabase.getCollection("Doll");

//         Save information to MongoDB
        Document document1 = new Document();
        document1.put("Name", "Eva");
        document1.put("Age", 18);

        Document document2 = new Document();
        document2.put("Name", "Jessica");
        document2.put("Age", 20);

        List<Document> dollList = new ArrayList<>();
        dollList.add(document1);
        dollList.add(document2);
        mongoCollection.insertMany(dollList);

        // Read
//        Document firstDocument = (Document) mongoCollection.find().first();
//        System.out.println(firstDocument.toJson());

        // Read many
//        MongoCursor iterator = mongoCollection.find().iterator();
//        while (iterator.hasNext())
//        {
//            Document next = (Document)iterator.next();
//            System.out.println(next.toJson());
//        }

        // Search one
//        Document document = new Document();
//        document.put("Name", "Jessica");
//        Document foundedDocument = (Document) mongoCollection.find(document).first();
//        System.out.println(foundedDocument.toJson());


        // Search many
//        Document document = new Document();
//        document.put("Name", "Jessica");
//        MongoCursor iterator = mongoCollection.find(document).iterator();
//        while (iterator.hasNext())
//        {
//            Document next = (Document)iterator.next();
//            System.out.println(next.toJson());
//        }

//        MongoCursor iterator = mongoCollection.find(
//                Filters.and(
//                        (Filters.gt("Age", 19)),
//                        (Filters.lte("Age", 20))
//                        )
//        ).iterator();
//
//        while (iterator.hasNext()) {
//            Document next = (Document) iterator.next();
//            System.out.println(next.toJson());
//        }

        // search one
//        Document document = new Document();
//        document.put("Name", "Jessica");
//        mongoCollection.deleteOne(document);


    }
}
