package com.example.waclone;

public class chatModel {

    private String contact,message,time;
    private int dp;

    chatModel(int dp,String contact,String message,String time){
      this.contact=contact;
      this.message=message;
      this.time=time;
      this.dp=dp;
    }



    public String getContact() {
        return contact;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public int getDp() {
        return dp;
    }
}
