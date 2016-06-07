package com.hitesh.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.vishal.myapplication.backend.myApi.MyApi;
import com.example.vishal.myapplication.backend.myApi.model.MyBean;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by Vishal on 07-06-2016.
 */
public class EndpointsAsyncTask extends AsyncTask<Pair<Context, String>, Void, String> {
    private static MyApi mJokeApi = null;
    private Context mContext;
    private String mResult;

    public EndpointsAsyncTask(Context context) {
        this.mContext = context;
        Log.d("Project","constructor");
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d("Project","onPreExecute");

    }

    @Override
    protected String doInBackground(Pair<Context, String>... params) {
        if (mJokeApi == null) {
            MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(),
                    new AndroidJsonFactory(), null)
                    .setRootUrl(mContext.getString(R.string.root_url_api));
            mJokeApi = builder.build();
            Log.d("Project","doIn");

        }
        try {
            return mJokeApi.putJoke(new MyBean()).execute().getJoke();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Hitesh";
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
        mResult = result;
        startJokeDisplayActivity();
        Log.d("Project","post");


    }

    private void startJokeDisplayActivity() {
        /*Intent intent = new Intent(mContext, JokeDisplayActivity.class);
        intent.putExtra(JokeDisplayActivity.INTENT_JOKE, mResult);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);*/
        Toast.makeText(mContext, mResult+" : joke aya", Toast.LENGTH_SHORT).show();
    }
}
