package com.example.sa04.abc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class PostMethodActivity extends AppCompatActivity {
    TextView tvpost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_method);
        tvpost=(TextView)findViewById(R.id.tv_post);
        pots("http://httpbin.org/post");
    }

    private void pots(String s) {
        RequestQueue requestQueue=Volley.newRequestQueue(this);
        JsonObjectRequest jsonObjectRequest=new JsonObjectRequest(
                Request.Method.POST,
                s,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("cacd0",response.toString());
                        postman(response);
                    }
                },

                new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(PostMethodActivity.this, "not", Toast.LENGTH_SHORT).show();

            }
        });
        requestQueue.add(jsonObjectRequest);
    }

    private void postman(JSONObject response) {
        try {
            String page=" ";
            JSONObject headers=response.getJSONObject("headers");
            String Accept=headers.getString("Accept");
            String lan=headers.getString("Accept-Encoding");
            String lon=headers.getString("Accept-Language");
            page=page+Accept+lan+lon;
            tvpost.setText(page);

        } catch (JSONException e) {
            Log.e("postman",e.toString());
            e.printStackTrace();
        }
    }
}
