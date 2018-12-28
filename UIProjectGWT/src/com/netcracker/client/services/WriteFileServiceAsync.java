package com.netcracker.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.netcracker.shared.Book;

import java.util.ArrayList;

public interface WriteFileServiceAsync {
    void writeFile(ArrayList<Book> books, AsyncCallback callback);
}
