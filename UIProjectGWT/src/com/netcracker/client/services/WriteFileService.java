package com.netcracker.client.services;


import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.netcracker.shared.Book;

import java.util.ArrayList;

@RemoteServiceRelativePath("writeFile")
public interface WriteFileService extends RemoteService {
    void writeFile(ArrayList<Book> books);
}
