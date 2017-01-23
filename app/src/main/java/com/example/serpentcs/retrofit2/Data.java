package com.example.serpentcs.retrofit2;

import java.util.List;

/**
 * Created by serpentcs on 21/1/17.
 */

public class Data {

    public static final String TAG;

    static {
        TAG = Data.class.getSimpleName();
    }

    UserInfo data;

    public Data(UserInfo data) {
        this.data = data;
    }

    public UserInfo getData() {
        return data;
    }

    public void setData(UserInfo data) {
        this.data = data;
    }

    public class UserInfo {

        List<Info> user_info;

        String promotional_date;

        public UserInfo(List<Info> user_info, String promotional_date) {

            this.user_info = user_info;
            this.promotional_date = promotional_date;
        }

        public List<Info> getUser_info() {
            return user_info;
        }

        public void setUser_info(List<Info> user_info) {
            this.user_info = user_info;
        }

        public String getPromotional_date() {
            return promotional_date;
        }

        public void setPromotional_date(String promotional_date) {
            this.promotional_date = promotional_date;
        }

        public class Info {

            String display_name;
            String email;


            public Info(String display_name, String email) {
                this.display_name = display_name;
                this.email = email;

            }

            public String getDisplay_name() {
                return display_name;
            }

            public void setDisplay_name(String display_name) {
                this.display_name = display_name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            @Override
            public String toString() {
                return "";
            }
        }

    }
}

