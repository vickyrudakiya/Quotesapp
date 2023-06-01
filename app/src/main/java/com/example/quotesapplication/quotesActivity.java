package com.example.quotesapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class quotesActivity extends AppCompatActivity {

    TextView txttools;

    ImageView imagshare,imagcopy;
    RecyclerView rcvquest;

    ArrayList<QuotesModelclass> Thorts = new ArrayList<>();

    String obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);
        initview();
    }
    private void initview() {
        txttools=findViewById(R.id.txttools);
        rcvquest=findViewById(R.id.rcvquest);


        if(getIntent()!=null){

            obj=getIntent().getStringExtra("Categari");
            txttools.setText(obj);

            if(obj.equals("Happy")) {
                QuotesModelclass h1 = new QuotesModelclass();
                h1.setQuotes("A great obstacle to happiness is to expect too much happiness");
                Thorts.add(h1);

                QuotesModelclass h2 = new QuotesModelclass();
                h2.setQuotes("Happiness is not the absence of problems, it’s the ability to deal with them.");
                Thorts.add(h2);

                QuotesModelclass h3 = new QuotesModelclass();
                h3.setQuotes("Be happy for this moment. This moment is your life");
                Thorts.add(h3);

                QuotesModelclass h4 = new QuotesModelclass();
                h4.setQuotes("He who lives in harmony with himself lives in harmony with the universe.");
                Thorts.add(h4);

                QuotesModelclass h5 = new QuotesModelclass();
                h5.setQuotes("Cheerfulness is what greases the axles of the world. Don’t go through life creaking");
                Thorts.add(h5);

                QuotesModelclass h6 = new QuotesModelclass();
                h6.setQuotes("Many things can make you miserable for weeks; few can bring you a whole day of happiness");
                Thorts.add(h6);

                QuotesModelclass h7 = new QuotesModelclass();
                h7.setQuotes("Sanity and happiness are an impossible combination");
                Thorts.add(h7);

                QuotesModelclass h8 = new QuotesModelclass();
                h8.setQuotes("On the whole, the happiest people seem to be those who have no particular cause for being happy except that they are so");
                Thorts.add(h8);

                QuotesModelclass h9 = new QuotesModelclass();
                h9.setQuotes("No one is in control of your happiness but you; therefore, you have the power to change anything about yourself or your life that you want to change");
                Thorts.add(h9);

                QuotesModelclass h10 = new QuotesModelclass();
                h10.setQuotes("When neither their property nor their honor is touched, the majority of men live content");
                Thorts.add(h10);

                QuotesModelclass h11 = new QuotesModelclass();
                h11.setQuotes("Plenty of people miss their share of happiness, not because they never found it, but because they didn’t stop to enjoy it");
                Thorts.add(h11);

                QuotesModelclass h12 = new QuotesModelclass();
                h12.setQuotes("The best way to cheer yourself up is to try to cheer somebody else up");
                Thorts.add(h12);

                QuotesModelclass h13 = new QuotesModelclass();
                h13.setQuotes("I have only two kinds of days: happy and hysterically happy");
                Thorts.add(h13);

                QuotesModelclass h14 = new QuotesModelclass();
                h14.setQuotes("On a deeper level you are already complete. When you realize that, there is a playful, joyous energy behind what you do");
                Thorts.add(h14);

                QuotesModelclass h15 = new QuotesModelclass();
                h15.setQuotes("The secret of happiness is not in doing what one likes, but in liking what one does");
                Thorts.add(h15);
            }
                if(obj.equals("Sad"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Not every “sorry” deserves an “it’s okay” in returns");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Life is a matter of prespectiv. There are many people who may know you, but there are very few who understand who you are");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("So many feelings so unsaid");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("And then i think that maybe i was desinged to be alone");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("I hate that I’m still hoping");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Tears have no weight. But it carries heavy feelings");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("I’m sorry i was not good enough. But i tried to be");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("I admit, when i am in a bad mood, everything annoys me");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Everyone has two eyes but no one has the same view");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("The worst feeling is when you don’t want to give up on someone but you know you have to");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("My mind is more talkative than my mouth");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Even the strongest feelings expire when ignored and taken for granted");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("Sometimes it’s better to stay silent and silent");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("Pain is not always in tears sometimes it also present in smiles");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("Depression isn’t just being a bit sad. It’s feeling nothing. It’s not wanting to be alive anymore");
                    Thorts.add(v15);

                }

                if(obj.equals("Health"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Health is a state of complete harmony of the body, mind, and spirit");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("We are what we repeatedly do. Excellence, then, is not an act, but a habit");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("So many feelings so unsaid");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("Follow your dreams, work hard, practice, and persevere. Make sure you eat a variety of foods, get plenty of exercise, and maintain a healthy lifestyle");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("It is health that is real wealth and not pieces of gold and silver");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Early to bed and early to rise makes a man healthy, wealthy, and wise");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("Nurturing yourself is not selfish – it’s essential to your survival and your well-being");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("The human body is the best picture of the human soul");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Funny"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Birthday"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("purpose"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Love"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Motivational"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Attitude"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Good Morning"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Brother"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Bike"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
                if(obj.equals("Break-Up"))
                {
                    QuotesModelclass v1=new QuotesModelclass();
                    v1.setQuotes("Never put off till tomorrow what you can do the day after tomorrow just as well");
                    Thorts.add(v1);

                    QuotesModelclass v2=new QuotesModelclass();
                    v2.setQuotes("Today’s goals: Coffee and kindness. Maybe two coffees, and then kindness.");
                    Thorts.add(v2);

                    QuotesModelclass v3=new QuotesModelclass();
                    v3.setQuotes("Trying is the first step toward failure.");
                    Thorts.add(v3);

                    QuotesModelclass v4=new QuotesModelclass();
                    v4.setQuotes("People say nothing is impossible, but I do nothing every day");
                    Thorts.add(v4);

                    QuotesModelclass v5=new QuotesModelclass();
                    v5.setQuotes("Dear optimist, pessimist, and realist—while you guys were busy arguing about the glass of wine, I drank it! Sincerely, the opportunist");
                    Thorts.add(v5);

                    QuotesModelclass v6=new QuotesModelclass();
                    v6.setQuotes("Be the person that when your feet touch the floor in the morning the devil says, “Awe sh*t, they’re up");
                    Thorts.add(v6);

                    QuotesModelclass v7=new QuotesModelclass();
                    v7.setQuotes("My therapist says I'm afraid of success. I guess I could understand that, because after all, fulfilling my potential would really cut into my sitting-around time");
                    Thorts.add(v7);

                    QuotesModelclass v8=new QuotesModelclass();
                    v8.setQuotes("There is no sunrise so beautiful that it is worth waking me up to see it");
                    Thorts.add(v8);

                    QuotesModelclass v9=new QuotesModelclass();
                    v9.setQuotes("Eat healthily, sleep well, breathe deeply, move harmoniously");
                    Thorts.add(v9);

                    QuotesModelclass v10=new QuotesModelclass();
                    v10.setQuotes("We know that food is a medicine, perhaps the most powerful drug on the planet with the power to cause or cure most disease");
                    Thorts.add(v10);

                    QuotesModelclass v11=new QuotesModelclass();
                    v11.setQuotes("If you truly treat your body like a temple, it will serve you well for decades");
                    Thorts.add(v11);

                    QuotesModelclass v12=new QuotesModelclass();
                    v12.setQuotes("Your body holds deep wisdom. Trust in it. Learn from it. Nourish it. Watch your life transform and be healthy");
                    Thorts.add(v12);

                    QuotesModelclass v13=new QuotesModelclass();
                    v13.setQuotes("What drains your spirit, drains your body. What fuels your spirit, fuels your body");
                    Thorts.add(v13);

                    QuotesModelclass v14=new QuotesModelclass();
                    v14.setQuotes("The food you eat can be either the safest and most powerful form of medicine or the slowest form of poison");
                    Thorts.add(v14);

                    QuotesModelclass v15=new QuotesModelclass();
                    v15.setQuotes("The greatest wealth is health");
                    Thorts.add(v15);
                }
        }
        QuotesAdapter adapter = new QuotesAdapter(quotesActivity.this,Thorts);
        rcvquest.setAdapter(adapter);
        LinearLayoutManager manager = new LinearLayoutManager(quotesActivity.this,RecyclerView.VERTICAL,false);
        rcvquest.setLayoutManager(manager);
    }
}