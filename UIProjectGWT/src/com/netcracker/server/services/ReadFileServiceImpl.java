package com.netcracker.server.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.netcracker.client.services.ReadFileService;
import com.netcracker.shared.Book;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.Buffer;
import java.util.ArrayList;

public class ReadFileServiceImpl extends RemoteServiceServlet implements ReadFileService {
    @Override
    public ArrayList<Book> readFile() {
        String path = getServletContext().getRealPath("library.json");
        //File file = new File(path);
        ArrayList<Book> library = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(path);
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = bufReader.readLine();
            while (line != null) {
                Gson gson = new Gson();
                Type type = new TypeToken<Book>(){}.getType();
                Book book = gson.fromJson(line, type);
                library.add(book);
                line = bufReader.readLine();
            }
            fileReader.close();
            bufReader.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        return library;
    }
}
