package com.example.freestyle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class Activity_Single_Receipe extends AppCompatActivity {
private TextView name;
private ImageView image;
private TextView LongRe;
    private String[] Receipe = {
            "Make sure you preheat your oven before starting. We’ve included temperatures for standard AND fan or convention ovens. If using springform pans, note that they are NOT 100% leakproof. Very thin cake batters such as this one will leak through the base. To combat this issue, line the base with parchment paper coming up where the sides meets the base to create a ‘cover’. Place a baking sheet on the shelf below the cake pan (or the bottom of the oven) to catch any stray drips. Don’t put cake pans directly on the pan as the heat will effect the base of your cakes Let cakes cool COMPLETELY before frosting. ",
            "Preheat oven to 350 degrees F (175 degrees C). Lightly grease a 9x5 inch loaf pan. In a large bowl, combine flour, baking soda and salt. In a separate bowl, cream together butter and brown sugar. Stir in eggs and mashed bananas until well blended. Stir banana mixture into flour mixture; stir just to moisten. Pour batter into prepared loaf pan. Bake in preheated oven for 60 to 65 minutes, until a toothpick inserted into center of the loaf comes out clean. Let bread cool in pan for 10 minutes, then turn out onto a wire rack.",
            "Check the package directions of the spaghetti you plan to cook. On the box, there should be an approximate cook time for “al-dente,” which means the pasta will be tender, but not mushy. It will still have a bit of a bite, which is perfect. Cook the spaghetti in salted water. The water should taste salty. This seasons the pasta as it cooks and is necessary for the best-tasting pasta. Toss the cooked spaghetti with a flavorful sauce Don’t just spoon the sauce on top of the pasta.",
            "Place the peeled kiwi pieces in a blender or small food processor with the simple syrup/sugar and lime juice, pulse until you have coarse puree. If you want an extra minty flavor for the mojitos, then add some mint leaves into the blender.\n" +
                    "If all the drinks will have alcohol, in a large pitcher, mix the kiwi puree with the rum, you can start by adding a lower amount and then adjust as you taste the final drink.\n" +
                    "Next add some ice cubes, mint leaves, and kiwi slices to the crushed kiwi and rum mix.",
            "In a small bowl, combine chili powder, cumin, paprika, oregano, garlic powder, 1 teaspoon salt and 1/2 teaspoon pepper. Season chicken with chili powder mixture Heat canola oil in a large skillet over medium high heat. Working in batches, add chicken to the skillet in a single layer and cook until golden brown and cooked through, reaching an internal temperature of 165 degrees F, about 4-5 minutes per side. Let cool before dicing into bite-size pieces.\n" +
                    "Serve chicken in tortillas, topped with pico de gallo, avocado, cilantro and lime."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_receipe);
        LongRe=findViewById(R.id.textView3);
        name=findViewById(R.id.textView2);
        image=findViewById(R.id.imageView2);
        Intent intent = getIntent();
        String id = intent.getStringExtra("Receipe_id");
        String text = "";
        switch (id) {
            case "Chocolate Cake":
                image.setImageResource(R.drawable.cake);
                name.setText(id);
                text = Receipe[0];
                break;
            case "Banana Bread":
                image.setImageResource(R.drawable.ban);
                name.setText(id);
                text = Receipe[1];
                break;
            case "Spaghetti":
                image.setImageResource(R.drawable.spaghetti);
                name.setText(id);
                text = Receipe[2];
                break;
            case "Kiwi Mojito":
                image.setImageResource(R.drawable.kiwim);
                name.setText(id);
                text = Receipe[3];
                break;
            case "Chicken Tacos":
                image.setImageResource(R.drawable.taco);
                name.setText(id);
                text = Receipe[4];
                break;
            default:
                image.setImageResource(R.drawable.food);
                name.setText(id);
                text = Receipe[3];
                break;
        }


        //TextView tv = new TextView(this);
        LongRe.setText(text);
        //scrollview.addView(tv);
    }
}