package com.example.mycity.data

import android.annotation.SuppressLint
import com.example.mycity.R
import com.example.mycity.model.Category
import com.example.mycity.model.Place

object LocalCityDataProvider {
    val defaultCategory = getCityData()[0]
    val defaultPlace = getCityData()[0].placeList[0]

    @SuppressLint("ResourceType")
    fun getCityData(): List<Category> {
        return listOf(
            Category(
                id = 0,
                categoryName = "Restaurants",
                categoryImage = R.drawable.restaurants,
                placeList = listOf(
                    Place(0,"Aubergine", "A fine dining restaurant offering modern Australian cuisine with a Michelin-level experience."),
                    Place(1,"Pilot", "A trendy restaurant known for its creative dishes and elegant atmosphere."),
                    Place(2,"Akiba", "A vibrant spot serving Asian fusion dishes with fresh ingredients and unique flavors."),
                    Place(3,"Raku", "A modern Japanese restaurant specializing in high-quality sushi and sashimi."),
                    Place(4,"Eightysix", "A stylish yet casual place offering contemporary Australian cuisine."),
                    Place(5,"Monster Kitchen and Bar", "A vegetarian-friendly restaurant known for its innovative plant-based dishes."),
                    Place(6,"Courgette", "A fine dining restaurant serving European-style cuisine paired with exquisite wines."),
                    Place(7,"Pialligo Estate", "A farm-to-table dining experience with fresh local produce and artisanal dishes.")
                )
            ),
            Category(
                id = 1,
                categoryName = "Parks & Nature",
                categoryImage = R.drawable.park_and_nature,
                placeList = listOf(
                    Place(0,"Australian National Botanic Gardens", "A lush botanical garden featuring Australia’s unique plant life."),
                    Place(1,"Lake Burley Griffin", "A picturesque lake ideal for walking, cycling, and kayaking."),
                    Place(2,"Mount Ainslie Lookout", "A stunning viewpoint offering panoramic views of Canberra."),
                    Place(3,"Tidbinbilla Nature Reserve", "A great place for wildlife spotting, including kangaroos and koalas."),
                    Place(4,"Namadgi National Park","A vast natural park perfect for hiking, camping, and exploring indigenous rock art."),
                    Place(5,"Commonwealth Park", "A beautifully landscaped park known for hosting the annual Floriade flower festival."),
                    Place(6,"Jerrabomberra Wetlands", "A peaceful sanctuary for birdwatching and enjoying nature."),
                    Place(7,"National Arboretum Canberra", "A collection of rare and endangered trees with scenic walking trails.")
                )
            ),
            Category(
                id = 2,
                categoryName = "Museums & Cultural Sites",
                categoryImage = R.drawable.museums_and_cultural_sites,
                placeList = listOf(
                    Place(0,"National Gallery of Australia", "Home to an extensive collection of Australian and international art."),
                    Place(1,"Australian War Memorial", "A museum and shrine dedicated to Australia’s military history."),
                    Place(2,"National Museum of Australia", "Showcasing Australia’s social history and indigenous heritage."),
                    Place(3,"Questacon – National Science and Technology Centre", "A hands-on science museum perfect for families."),
                    Place(4,"Old Parliament House", "A historical site exploring Australia’s political history."),
                    Place(5,"National Portrait Gallery", "Featuring portraits of notable Australians from various fields."),
                    Place(6,"Canberra Glassworks", "A unique gallery and workshop where visitors can see glass art being made."),
                    Place(7,"Royal Australian Mint", "The official coin-producing facility, offering tours to see how coins are made.")
                )
            ),
            Category(
                id = 3,
                categoryName = "Shopping & Markets",
                categoryImage = R.drawable.shopping_and_markets,
                placeList = listOf(
                    Place(0,"Canberra Centre", "A major shopping mall with a wide range of fashion, dining, and entertainment options."),
                    Place(1,"Old Bus Depot Markets", "A vibrant weekend market featuring handmade crafts, fresh produce, and unique gifts."),
                    Place(2,"Lonsdale Street, Braddon", "A trendy area with boutique stores, specialty coffee shops, and local designers."),
                    Place(3,"Fyshwick Fresh Food Markets", "The best place for fresh seafood, organic produce, and gourmet foods."),
                    Place(4,"Haig Park Village Markets", "A charming market offering artisanal products and delicious street food."),
                    Place(5,"DFO Canberra", "A large outlet shopping center with discounts on major brands."),
                    Place(6,"Kingston Foreshore Markets", "A waterfront market featuring local art, jewelry, and gourmet treats."),
                    Place(7,"Bisonhome", "A boutique shop specializing in beautifully crafted ceramics and home decor.")
                )
            ),
            Category(
                id = 4,
                categoryName = "Entertainment & Nightlife",
                categoryImage = R.drawable.entertainment_and_nightlife,
                placeList = listOf(
                    Place(0,"The Howling Moon", "A stylish rooftop bar with panoramic views and crafted cocktails."),
                    Place(1,"Molly", "A hidden speakeasy-style bar known for its exceptional whiskey selection."),
                    Place(2,"Hippo Co", "A lively bar with jazz performances and an extensive whiskey menu."),
                    Place(3,"Dendy Cinemas Canberra", "A premium cinema offering the latest films with luxury seating."),
                    Place(4,"Canberra Theatre Centre", "The main venue for live performances, including theatre, music, and comedy."),
                    Place(5,"King O’Malley’s", "A traditional Irish pub with live music and a friendly atmosphere."),
                    Place(6,"Reload Bar & Games", "A unique bar where you can play video games while enjoying drinks."),
                    Place(7,"Casino Canberra", "The city’s only casino, offering gaming tables, fine dining, and entertainment."),
                )
            )
        )
    }
}