package com.netcracker.client.services;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.netcracker.shared.Book;

import java.util.ArrayList;

public interface SortServiceAsync {
    void sortTable(ArrayList<Book> unsortes, AsyncCallback<ArrayList<Book>> callback);
}
