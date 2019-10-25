package com.example.infshw2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MenuDatabase {

    public static Menu getMenuById(int itemId) {
        return menu.get(itemId);
    }

    public static ArrayList<Menu> getAllMenu() {
        return new ArrayList<Menu>((List) Arrays.asList(menu.values().toArray()));
    }

        private static final HashMap<Integer, Menu> menu = new HashMap<>();

static {
            menu.put(1,new Menu(
                    1, "Potato Tots",
                    2.00,
                    "Signature crunchy, golden Potato Tots."
                    , R.drawable.menu1));
            menu.put(2,new Menu(2, "Cheese burger",
                    2.50,
                    "Signature flame-grilled, beef patty topped with a slice of melted Australian cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun."
                    , R.drawable.menu2));
            menu.put(3,new Menu(3, "Chicken Nuggets",
                    11.25,
                    "Bite-sized Chicken Nuggets are tender on the inside and crispy on the outside."
                    , R.drawable.menu3));
            menu.put(4,new Menu(4, "Chicken Burger",
                    5.60,
                    "Flame-grilled chicken, loaded with chopped lettuce, creamy spicy sauce, and served to you freshly prepared on a perfectly toasted sesame seed bun."
                    , R.drawable.menu4));
            menu.put(5,new Menu(5, "Quarter Pounder",
                    5.60,
                    "Flame-grilled 100% beef, topped with Australian cheese, freshly sliced onions, zesty pickles, ketchup, & mustard all on a toasted sesame seed bun"
                    , R.drawable.menu5));
            menu.put(6,new Menu(6, "Chicken Salad",
                    5.00,
                    " Toss of crispy green romaine, green leaf and radicchio lettuce, thick-cut smoked bacon pieces, shredded cheddar cheese, juicy-ripened tomatoes, and buttery garlic croutons.",
                    R.drawable.menu6));
            menu.put(7,new Menu(7, "Hamburger",
                    2.00,
                    "Beef patty topped with crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                    R.drawable.menu7));
            menu.put(8,new Menu(8, "Frozen coke",
                    3.00,
                    "Tangy and refreshing frozen coke",
                    R.drawable.menu8));
            menu.put(9,new Menu(9, "Vanilla Milkshake",
                    3.00,
                    "Creamy and thick vanilla milkshake",
                    R.drawable.menu9));
            menu.put(10,new Menu(10, "Chicken Caesar Salad",
                    4.50,
                    "Mix of crisp green romaine, green leaf and radicchio lettuce, juicy-ripened tomatoes, buttery garlic croutons, and shredded cheddar cheese.",
                    R.drawable.menu10));
            menu.put(11,new Menu(11, "Fish Burger",
                    3.6,
                    "White Alaskan Pollock breaked with panko,topped with sweet tartar sauce, tangy pickles, all on top of a toasted brioche-style bun.",
                    R.drawable.menu11));
            menu.put(12,new Menu(12, "Garden Salad",
                    3.80,
                    "Blend of premium lettuces garnished with juicy tomatoes, home-style croutons, a three-cheese medley and sauce",
                    R.drawable.menu12));
            menu.put(13,new Menu(13, "Cheese and Bacon Burger",
                    3.00,
                    " Amazing flame-grilled beef patty topped with smoked bacon and a layer of melted Australian cheese, crinkle cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun.",
                    R.drawable.menu13));
            menu.put(14,new Menu(14, "Chocolate Shake",
                    0.50,
                    "Smooth shake made with velvety vanilla soft serve ",
                    R.drawable.menu14));
            menu.put(15,new Menu(15, "Soft Serve",
                    1.00,
                    "Cool and creamy",
                    R.drawable.menu15
            ));
    }
}
