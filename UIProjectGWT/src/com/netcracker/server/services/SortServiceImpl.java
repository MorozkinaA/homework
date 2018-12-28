package com.netcracker.server.services;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.netcracker.client.services.SortService;
import com.netcracker.shared.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class SortServiceImpl extends RemoteServiceServlet implements SortService {
    @Override
    public ArrayList<Book> sortTable(ArrayList<Book> unsorted) {
        ArrayList<Book> sorted = new ArrayList<>();
        String[] titles = new String[unsorted.size()];
        int i = 0;
        for( Book b : unsorted) {
           titles[i] = b.getTitle();
           i++;
        }
        Arrays.sort(titles);
        for(String t : titles) {
            for(Book b : unsorted) {
                if(b.getTitle().equals(t)){
                    sorted.add(b);
                }
            }
        }
        return sorted;
    }
}
