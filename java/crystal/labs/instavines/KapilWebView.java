package crystal.labs.instavines;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class KapilWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapil_web_view);

        WebView view;
        view = (WebView) findViewById(R.id.webView);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("");

    }
}
