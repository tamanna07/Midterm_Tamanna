package json.parser;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import databases.ConnectToSqlDB;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=YOUR_API_KEY

      MY_API_KEY=0d9e35dfa3c140aab8bf9cdd70df957f

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},
		"author": null,
		"title": "Who is affected by a shutdown? - CNN Video",
		"description": "CNN's Tom Foreman breaks down who is affected by a federal government partial shutdown.",
		"url": "http://us.cnn.com/videos/politics/2018/12/22/federal-partial-shutdown-by-the-numbers-foreman-ctn-vpx.cnn",
		"urlToImage": "https://cdn.cnn.com/cnnnext/dam/assets/181202171029-government-shutdown-capitol-file-super-tease.jpg",
		"publishedAt": "2018-12-23T01:09:50.8583193Z",
		"content": "Chat with us in Facebook Messenger. Find out what's happening in the world as it unfolds."
	   },{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */

    public static void main(String[] args) throws Exception {


        List<String> idList = new ArrayList();
        List<String> nameList = new ArrayList();
        List<String> authorList = new ArrayList();
        List<String> titleList = new ArrayList();
        List<String> desList = new ArrayList();
        List<String> urlList = new ArrayList();
        List<String> urlmList = new ArrayList();
        List<String> pubList = new ArrayList();
        List<String> conList = new ArrayList();
        Map<String, List<String>> map = new HashMap<>();


        try {
            URL sUrl = new URL("https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=5133d895398a4f0fb198b80c9762d89b");
            URLConnection request = sUrl.openConnection();
            request.connect();

            JsonParser jsonParser = new JsonParser();
            JsonElement root = jsonParser.parse(new InputStreamReader((InputStream) request.getContent()));

            JsonObject jsonObject = new JsonObject();
            jsonObject.add("articles", root);

            JsonArray jsonArray = new JsonArray();
            jsonArray.add(root.getAsJsonObject().get("articles"));


            for (int k = 0; k < jsonArray.get(0).getAsJsonArray().size(); k++) {


                JsonObject jsonobject = jsonArray.get(0).getAsJsonArray().get(k).getAsJsonObject();


                String id = jsonobject.get("source").getAsJsonObject().get("id").toString();
                System.out.print(id);
                idList.add(id);

                String name = jsonobject.get("source").getAsJsonObject().get("name").toString();
                System.out.print(name);
                nameList.add(name);

                String a = jsonobject.get("author").toString();
                System.out.print(a);
                authorList.add(a);
                String t = jsonobject.get("title").toString();
                System.out.print(t);
                titleList.add(t);
                String des = jsonobject.get("description").toString();
                System.out.print(des);
                desList.add(des);
                String url = jsonobject.get("url").toString();
                System.out.print(url);
                urlList.add(url);
                String urlm = jsonobject.get("urlToImage").toString();
                System.out.print(urlm);
                urlmList.add(urlm);
                String pub = jsonobject.get("publishedAt").toString();
                System.out.print(pub);
                pubList.add(pub);
                String con = jsonobject.get("content").toString();
                System.out.print(con);
                conList.add(con);
                System.out.println();
                map.put("all_id", idList);
                map.put("all_name", nameList);
                map.put("all_author", authorList);
                map.put("all_title", titleList);
                map.put("all_description", desList);
                map.put("all_url", urlList);
                map.put("all_urlImage", urlmList);
                map.put("all_publication", pubList);
                map.put("all_content", conList);


            }


        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        List lst1 = idList;
        List lst2 = nameList;
        List lst3 = authorList;
        List lst4 = titleList;
        List lst5 = desList;
        List lst6 = urlList;
        List lst7 = urlmList;
        List lst8 = pubList;
        List lst9 = conList;


    }

}