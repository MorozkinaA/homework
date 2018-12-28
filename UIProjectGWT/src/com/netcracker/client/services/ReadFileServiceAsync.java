package com.netcracker.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.netcracker.shared.Book;

import java.util.ArrayList;

public interface ReadFileServiceAsync {
    void readFile(AsyncCallback<ArrayList<Book>> callback);
}
