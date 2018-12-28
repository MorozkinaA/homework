package com.netcracker.server.services;

import com.google.gson.Gson;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.netcracker.client.services.WriteFileService;
import com.netcracker.shared.Book;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFileServiceImpl extends RemoteServiceServlet implements WriteFileService {
    @Override
    public void writeFile(ArrayList<Book> books) {
        String path = getServletContext().getRealPath("library.json");
        try{
            FileWriter fw = new FileWriter(path);
            fw.write("");
            fw.close();
            FileWriter writer = new FileWriter(path, true);
            Gson gson = new Gson();
            for(Book b : books) {
                writer.write(gson.toJson(b) + "\n");
            }
            writer.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
