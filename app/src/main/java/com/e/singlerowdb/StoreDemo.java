package com.e.singlerowdb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

public class StoreDemo {
    SharedPreferences sp;
    Context con;
    public StoreDemo(Context c)
    {
        con=c;
        sp=con.getSharedPreferences("Edufab",Context.MODE_PRIVATE);
        //create database
    }
    public void insert(String ph,String em,String pw)
    {
        SharedPreferences.Editor ed=sp.edit();
        ed.putString("phone",ph);
        ed.putString("email",em);
        ed.putString("password",pw);
        ed.commit(); // save
        Toast.makeText(con, "Data Successfully Inserted", Toast.LENGTH_SHORT).show();

    }
    public void update(String ph,String pw)
    {
        SharedPreferences.Editor ed=sp.edit();
        if(sp.getString("phone",null).equals(ph))
        {
            ed.putString("password", pw);
            ed.commit(); // save
            Toast.makeText(con, "Data Successfully Updated", Toast.LENGTH_SHORT).show();
        }
    }
    public void delete(String ph)
    {
        SharedPreferences.Editor ed=sp.edit();
        if(sp.getString("phone",null).equals(ph)) {
            ed.clear();
             ed.commit(); // save
            Toast.makeText(con, "Data Successfully Deleted", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(con, "What you want to Delete", Toast.LENGTH_SHORT).show();
        }
    }


    public String show()
    {
        String data="Phone : "+sp.getString("phone",null)+
                "\nEmail : "+sp.getString("email",null)+
                "\nPassword : "+sp.getString("password",null);

        return  data;

    }


}
