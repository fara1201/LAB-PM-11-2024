package com.example.myapplication;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Postingan> postingans = generateDummyPostingans();
    private static ArrayList<Postingan> generateDummyPostingans() { //data palsu untuk tes codingan jalan sebelum data asli diisi
        ArrayList<Postingan> postingans = new ArrayList<>();
        postingans.add(new Postingan(R.drawable.aeris,"aerisbeaute", R.drawable.postaeris, "4.4 FLASH SALE"));
        postingans.add(new Postingan(R.drawable.dearme,"dearmebeauty", R.drawable.postdearme, "Hypergloss Lip Balm DEAR RACHEL"));
        postingans.add(new Postingan(R.drawable.esqa,"esqacosmetics", R.drawable.postesqa, "Sunset Stunner from Esqa"));
        postingans.add(new Postingan(R.drawable.holika,"holikaholika", R.drawable.postholika, "Set MakeUp Holika"));
        postingans.add(new Postingan(R.drawable.nivea,"nivea.id", R.drawable.postnivea, "Pilih MicellAIR yang tepat untuk kulitmu"));
        postingans.add(new Postingan(R.drawable.makeover,"makeover.id", R.drawable.postmakeover, "Coming Soon"));
        postingans.add(new Postingan(R.drawable.pinkflash,"pinkflash", R.drawable.postpinkflash, "Lip product"));
        postingans.add(new Postingan(R.drawable.rarebeauty,"rarebeauty", R.drawable.postrarebeauty, "easy To Blend"));
        postingans.add(new Postingan(R.drawable.roseallday,"roseallday", R.drawable.postroseallday, "Available in 10 SHADES"));
        postingans.add(new Postingan(R.drawable.tbs,"thebodyshop", R.drawable.posttbs, "Body Butter Vegan"));
        return postingans;
    }
    public static ArrayList<Story> stories = generateDummyStorys();
    private static ArrayList<Story> generateDummyStorys() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story("aerisbeaute",R.drawable.aeris));
        stories.add(new Story("thebodyshop",R.drawable.tbs));
        stories.add(new Story("roseallday",R.drawable.roseallday));
        stories.add(new Story("rarebeauty",R.drawable.rarebeauty));
        stories.add(new Story("pinkflash",R.drawable.pinkflash));
        stories.add(new Story("nivea.id",R.drawable.nivea));
        stories.add(new Story("esqacosmetics",R.drawable.esqa));
        stories.add(new Story("dearmebeauty",R.drawable.dearme));
        stories.add(new Story("holikaholika",R.drawable.holika));
        stories.add(new Story("makeover.id",R.drawable.makeover));
        return stories;
    }
}