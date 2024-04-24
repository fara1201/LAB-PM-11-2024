package com.example.pertemuan4;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();
    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("aerisbeaute","aeris.id"
                ,"Jangan Lewatkan FLASH SALE 4.4 DISCON UP TO 70%"
                ,R.drawable.aeris,R.drawable.postaeris));

        instagrams1.add(new Instagram("rarebeauty", "rare beauty SG"
                ,"our latest makeup collection"
                ,R.drawable.rarebeauty,R.drawable.postrarebeauty));

        instagrams1.add(new Instagram("roseallday", "rad.id"
                ,"powder foundation available in 10 shades"
                ,R.drawable.roseallday, R.drawable.postroseallday));

        instagrams1.add((new Instagram("dearmebeauty","dear me beauty"
                ,"our new lip products"
                ,R.drawable.dearme,R.drawable.postdearme)));

        instagrams1.add(new Instagram("holikaholika", "holika.ofc"
                ,"coming soon"
                ,R.drawable.holika,R.drawable.postholika));

        instagrams1.add(new Instagram("thebodyshop","tbs.id"
                ,"body butter SCENT CHANGING"
                ,R.drawable.tbs, R.drawable.posttbs));

        instagrams1.add(new Instagram("esqacosmetics","esqa costmetics"
                , "make up set Sunset Stunner"
                ,R.drawable.esqa,R.drawable.postesqa));

        instagrams1.add(new Instagram("nivea.id","nivea"
                ,"hempaskan kotoran diwajah dengan Micellar Air from Nivea"
                ,R.drawable.nivea, R.drawable.postnivea));

        instagrams1.add(new Instagram("pinkflash", "pink flash"
                ,"new shade"
                ,R.drawable.pinkflash, R.drawable.postpinkflash));

        instagrams1.add(new Instagram("makeover.id", "make over"
                ,"coming soon"
                ,R.drawable.makeover, R.drawable.postmakeover));
        return instagrams1;
    }
}
