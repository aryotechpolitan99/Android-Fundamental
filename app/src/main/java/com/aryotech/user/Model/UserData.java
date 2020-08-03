package com.aryotech.user.Model;

import com.aryotech.user.R;

import java.util.ArrayList;

public class UserData {

    private static String[] listUserName = {

            "ahmad@gmail.com",
            "bella@gmail.com",
            "cindy@gmail.com",
            "daud@gmail.com",
            "esa@gmail.com",
            "fatih@gmail.com",
            "geys@gmail.com",
            "harun@gmail.com",
            "ilyas@gmail.com",
            "jamilah@gmail.com"
    };

    private static String[] listName = {

            "Ahmad Kosasih",
            "Bella Fuzia",
            "Cindy Felicia",
            "Daud Maulana",
            "Esa Mahardika",
            "Fatih Karim",
            "Geys Abdurrahman",
            "Harun Ar Rasyid",
            "Ilyas Septian",
            "Jamilah Nurohmah"
    };

    private static int[] listAvatar = {

            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5,
            R.drawable.image_6,
            R.drawable.image_7,
            R.drawable.image_8,
            R.drawable.image_9,
            R.drawable.image_10,
    };

    private static String[] listCompany = {

            "Intel Corporation",
            "LG Electronics",
            "Toshiba Corporation",
            "Panasonic Corporation",
            "Sony Corporation ",
            "Hitachi Ltd.",
            "Microsoft Corporation",
            "HP Inc.",
            "Samsung Electronics",
            "Apple Inc."
    };

    private static String[] listLocaction ={

            "Amerika Serikat",
            "Korea Selatan",
            "Jepang",
            "Jepang",
            "Jepang",
            "Jepang",
            "Amerika Serikat",
            "Amerika Serikat",
            "Korea Selatan",
            "Amerika Serikat"
    };

    private static String[] listRepository ={

            "AhmadKosasih01",
            "BellaFuzia02",
            "CindyFelicia03",
            "DaudMaulana04",
            "EsaMahardika05",
            "FatihKarim06",
            "GeysAbdurrahman07",
            "HarunArRasyid08",
            "IlyasSeptian09",
            "JamilahNurohmah10"
    };

    private static String [] listFollower = {

            "91K",
            "3M",
            "4M",
            "90K",
            "92K",
            "93K",
            "94K",
            "95K",
            "96K",
            "5M"
    };

    private static String[] listFollowing = {
            "1111",
            "1112",
            "1113",
            "1114",
            "1115",
            "1116",
            "1117",
            "1118",
            "1119",
            "1110"
    };

    public static ArrayList<User> getListUser(){

        ArrayList<User> list = new ArrayList<>();
        for (int position = 0; position< listUserName.length; position++){

            User users = new User();
            users.setUserName(listUserName[position]);
            users.setNama(listName[position]);
            users.setAvatar(listAvatar[position]);
            users.setCompany(listCompany[position]);
            users.setLocation(listLocaction[position]);
            users.setRepository(listRepository[position]);
            users.setFollower(listFollower[position]);
            users.setFollowing(listFollowing[position]);
            list.add(users);
        }
        return list;
    }
}
