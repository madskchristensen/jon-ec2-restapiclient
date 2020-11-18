package com.example.restapiclient;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // kan være SpringRunner
@SpringBootTest
public class RestTemplateExamples {

//    final String API_ROOT = "https://api.predic8.de:443/shop/";

//    @Test
//    public void getCategories(){
//        String path = API_ROOT + "categories/";
//        RestTemplate restTemplate = new RestTemplate();
//        JsonNode jsonNode = restTemplate.getForObject(path, JsonNode.class);
//
//        JsonNode categories = jsonNode.get("categories");
//        List<Category> list = new ArrayList<>();
//        categories.iterator().forEachRemaining(cat -> {
//            if (cat.get("name") != null){
//                list.add(new Category(cat.get("name").asText(),cat.get("category_url").asText()));
//            }
//        });
//        System.out.println(list);
//
//    }

    // 1. Lav din egen Category klasse med de to String attributter
    // name og category_url DONE
    // 2. Opret en Liste med Category objekter
    // 3. opret et Category objekt for hver JsonNode cat objekt
    // 4. Udskriv listen med alle Category objekterne
}
