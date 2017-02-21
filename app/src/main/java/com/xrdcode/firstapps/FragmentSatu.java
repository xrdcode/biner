package com.xrdcode.firstapps;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSatu extends Fragment {
    private static final String URL = "http://biner.mathunj.org/";

    public FragmentSatu() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_fragment_satu, container, false);

        /* TODO: Register webview element here */

        /* TODO: Implement webview code here*/
        return v;
    }

}
